import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
@Preview
@Composable
fun ChatBotScreen() {
    var chatHistory by remember { mutableStateOf(listOf<ChatMessage>()) }
    var message by remember { mutableStateOf("") }

    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ChatMessageList(chatHistory)
        Spacer(modifier = Modifier.height(16.dp))
        ChatInputField(
            message = message,
            onMessageChange = { message = it },
            onSendClick = {
                if (message.isNotEmpty()) {
                    chatHistory = chatHistory + ChatMessage("You", message, false)
                    coroutineScope.launch {
                        sendMessageToChatbot(message)
                    }
                    message = ""
                }
            }
        )
    }
}

@Composable
fun ChatMessageList(messages: List<ChatMessage>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        for (message in messages) {
            ChatBubble(message)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun ChatBubble(message: ChatMessage) {
    val backgroundColor = if (message.isUser) Color.Gray else Color.Blue

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .background(backgroundColor)
        ) {
            Text(
                text = message.text,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun ChatInputField(
    message: String,
    onMessageChange: (String) -> Unit,
    onSendClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        BasicTextField(
            value = message,
            onValueChange = { onMessageChange(it) },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Send
            ),
            keyboardActions = KeyboardActions(
                onSend = { onSendClick() }
            ),
            modifier = Modifier.weight(1f)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Button(
            onClick = { onSendClick() }
        ) {
            Text("Send")
        }
    }
}

data class ChatMessage(val sender: String, val text: String, val isUser: Boolean)

suspend fun sendMessageToChatbot(message: String) {
    val apiKey = "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" // Replace with your OpenAI API key
    val url = "https://api.openai.com/v1/engines/davinci/completions"
    val client = OkHttpClient()

    val requestBody = """
        {
            "model": "text-davinci-002",
            "prompt": "$message",
            "max_tokens": 50
        }
    """.trimIndent().toRequestBody("application/json".toMediaType())

    val request = Request.Builder()
        .url(url)
        .post(requestBody)
        .addHeader("Authorization", "Bearer $apiKey")
        .build()

    withContext(Dispatchers.IO) {
        try {
            val response = client.newCall(request).execute()
            val responseBody = response.body?.string()
            if (response.isSuccessful && !responseBody.isNullOrBlank()) {
                val botResponse = responseBody
                // Update chat history with the bot's response
            } else {
                // Handle error
            }
        } catch (e: Exception) {
            // Handle exception
        }
    }
}
