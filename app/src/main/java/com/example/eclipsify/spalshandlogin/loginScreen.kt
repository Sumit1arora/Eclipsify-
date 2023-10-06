package com.example.eclipsify.spalshandlogin

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eclipsify.R
import com.google.firebase.auth.FirebaseAuth

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginPage() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var loginError by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.newbg),
            contentDescription ="BCG",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize())
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription ="logo",
                modifier = Modifier.size(317.dp, 221.dp)
            )
            Text(text = "Login Account", fontSize = 24.sp,
                color = Color.White, fontFamily = FontFamily(
                    Font(R.font.lzsemibold)), modifier = Modifier.padding(top = 28.dp))
            Spacer(modifier = Modifier.padding(20.dp))
            emailTextField(email,{email=it})
            Spacer(modifier = Modifier.padding(5.dp))
            passwordTextField(password = password, onPasswordChange ={password=it} )

            Text(text = "Forgot Password ?", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(start = 235.dp, top = 5.dp))
            Spacer(modifier = Modifier.padding(28.dp))
            loginButton()
            Spacer(modifier = Modifier.padding(20.dp))
            googleButton("Login With Google")


        }




    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun emailTextField(username:String,onUsernameChange:(String)-> Unit) {
    OutlinedTextField(value = username, onValueChange =onUsernameChange, label = { Text(text = "Enter Email id", color = colorResource(
        id = R.color.blueAcc
    ))}, modifier = Modifier.requiredWidth(350.dp)
        ,
        shape = RoundedCornerShape(30.dp), colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.White, unfocusedBorderColor = Color.White),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun passwordTextField(password:String,onPasswordChange:(String)->Unit) {
    OutlinedTextField(value = password, onValueChange =onPasswordChange, label = { Text(text = "Enter Password", color = colorResource(
        id = R.color.blueAcc
    ))}, modifier = Modifier.requiredWidth(350.dp)
        ,
        shape = RoundedCornerShape(30.dp), colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.White, unfocusedBorderColor = Color.White
        ), visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))

}

@Composable
fun loginButton() {
    Button(onClick = {
    }, colors = ButtonDefaults.buttonColors(Color.White), modifier = Modifier.requiredSize(350.dp,50.dp)) {
        Text(text = "Login", fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lesemibold)), modifier = Modifier, color = colorResource(
            id = R.color.blueAcc
        ))

    }
    
}

@Composable
fun googleButton(txt:String) {
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.White), modifier = Modifier.requiredSize(350.dp,50.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.googlelogo),
                contentDescription = "google",
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = txt,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif,
                color = colorResource(id = R.color.blueAcc)
            )
        }


    }


    }
fun performLogin(context: Context,email:String,password:String) {
    FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // Login successful
                // You can navigate to the next screen or perform any action here
            } else {
                // Login failed
            }
        }
}
