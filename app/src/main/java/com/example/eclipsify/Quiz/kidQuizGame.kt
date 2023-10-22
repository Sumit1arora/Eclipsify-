package com.example.eclipsify.Quiz


import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.eclipsify.R

data class Questi(val text: String, val options: List<String>, val correctAnswer: String)

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun kidQuizApp(navController: NavHostController) {
    val questions = listOf(
        Questi("During a total lunar eclipse, what color does the Moon appear to be?",
             listOf("Red","Green","White","Blue"), "Red"),

                Questi("How long may a lunar eclipse last?",listOf("Several seconds","Several minutes","Several hours","Several days"), "Several hours"),

    Questi("During a partial eclipse, the Moon is in the Earth's...", listOf("Penumbra","Umbra"), "Penumbra"),

    Questi("When a total lunar eclipse happens, the Moon is in the Earth's...", listOf("Penumbra","Umbra"), "Umbra"),

    Questi("A lunar eclipse is caused by the shadow of the Earth.", listOf("True","False"), "True"),

    Questi("During which Moon phase might a lunar eclipse be viewed on Earth?", listOf("New Moon","First Quarter","Full Moon","Last Quarter"), "Full Moon"),

    Questi("During a total lunar eclipse, what happens to the Moon's surface?", listOf("It becomes completely dark with no visible features.","It remains as bright as during a full moon.","It turns a deep red or copper color.","It turns blue."), "It turns a deep red or copper color."),

    Questi("How often do lunar eclipses typically occur?", listOf("Once a month","Once a year","Several times a year","Once a decade"), "Several times a year"),

    Questi("During a total lunar eclipse, what color does the Moon appear to be?", listOf("Red","Green","White","Blue"), "Red"),

    Questi("During which Moon phase might a lunar eclipse be viewed on Earth?", listOf("New Moon","First Quarter","Full Moon","Last Quarter"), "Full Moon")
    )

    var currentQuestionIndex by remember { mutableStateOf(0) }
    var selectedAnswer by remember { mutableStateOf("") }
    var correctAnswersCount by remember { mutableStateOf(0) }
    var Count by remember { mutableStateOf(1) }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.newbg), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

        Column(
            modifier = Modifier
                .padding(16.dp)
                .offset(0.dp, 190.dp), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (currentQuestionIndex < questions.size) {
                val currentQuestion = questions[currentQuestionIndex]
                Text(text = "Question ${Count}/10", color = colorResource(id = R.color.gold), fontSize = 27.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.offset(-44.dp,-105.dp))
                Text(text = "........................................................", color = colorResource(
                    id = R.color.gold,), fontSize = 13.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.offset(-8.dp,-95.dp)
                )
                Box(modifier = Modifier.fillMaxWidth(),){
                    Text(text = currentQuestion.text, fontSize = 22.sp, fontFamily = FontFamily(Font(R.font.popreg)), modifier = Modifier
                        .padding(start = 15.dp, bottom = 20.dp)
                        .offset(-1.dp, -40.dp)
                        .fillMaxWidth(1f),fontWeight = FontWeight.SemiBold, color = Color.White, textAlign = TextAlign.Justify, letterSpacing=2.sp)}
                Spacer(modifier = Modifier.height(10.dp))

                currentQuestion.options.forEach { option ->

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {

                        OutlinedButton(onClick = { selectedAnswer = option }, modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp), border = BorderStroke(1.4.dp,
                            Color.White)) {




                            Text(
                                text = option, fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.popreg)), fontWeight = FontWeight.Normal, color = Color.White,
                                modifier = Modifier
                                    .padding(start = 8.dp, top = 6.dp, bottom = 6.dp)
                                    .width(250.dp)

                            )

                            RadioButton(modifier = Modifier.padding(start = 27.dp), colors = RadioButtonDefaults.colors(
                                selectedColor = Color.White,
                                unselectedColor = Color.White
                            ),
                                selected = (selectedAnswer == option),
                                onClick = { selectedAnswer = option }
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(modifier = Modifier
                    .wrapContentHeight()
                    .width(133.dp), colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.gold)),
                    onClick = {
                        Count++
                        if (selectedAnswer == currentQuestion.correctAnswer) {

                            correctAnswersCount++

                        }

                        selectedAnswer = ""
                        currentQuestionIndex++

                    },
                    enabled = (selectedAnswer.isNotEmpty())
                ) {
                    Text(text = "Next",)
                }
            } else {
                Box(modifier = Modifier.fillMaxSize()){

                    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Image(painter = painterResource(id = R.drawable.cong) , contentDescription = "", modifier = Modifier
                            .padding(top = 2.dp)
                            .size(227.dp, 227.dp)
                            .offset(0.dp, -20.dp))

                        Text(text = "Quiz Score", fontSize = 40.sp, color = colorResource(id = R.color.gold), fontFamily = FontFamily(
                            Font(R.font.popreg),
                        ), fontWeight =   FontWeight.SemiBold)

                        Text(text = "${correctAnswersCount}/10", fontSize = 40.sp, color = colorResource(id = R.color.white), fontFamily = FontFamily(
                            Font(R.font.popreg),
                        ), fontWeight =   FontWeight.SemiBold)


                    }
                }
            }
        }
    }
}



