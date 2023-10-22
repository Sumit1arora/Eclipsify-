package com.example.eclipsify.Quiz

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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

data class Question(val text: String, val options: List<String>, val correctAnswer: String)

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun QuizApp(navController: NavHostController) {
     val questions = listOf(
        Question("What is a Solar Eclipse?", listOf("When the Earth passes between the Sun and the Moon.", "When the Moon passes between the Earth and the Sun.", "When the Earth passes between the Sun and another planet.","When a comet blocks the Sun's light."), "Paris"),
         Question("What is the term for the darkest inner part of the shadow cone where a total eclipse can be viewed?", listOf("Umbra", "Penumbra", "Totality"), "Umbra"),
         Question("During which type of solar eclipse does the Diamond Ring effect occur?", listOf("Partial solar eclipse", "Annular solar eclipse", "Total solar eclipse", "Hybrid solar eclipse"), "Total solar eclipse")
    ,Question("Solar eclipses always occur at the phase of the Moon.", listOf("Full Moon", "Half Moon", "Crescent Moon", "New Moon"), "New Moon")
   , Question("You must wear your eclipse goggles at all times except during totality due to safety reasons.", listOf("False", "True"),"True"),
         Question("What type of solar eclipse darkens the sky and reveals the Sun's corona??", listOf("Annular Solar Eclipse","Total Solar Eclipse","Partial Solar Eclipse","Hybrid Solar Eclipse"), "Total Solar Eclipse")
                , Question("When will the next total solar eclipse in the United States occur?", listOf("July 22, 2023","October 14, 2023","April 8, 2024","June 5, 2024"), "April 8, 2024")
   , Question("What type of solar eclipse is a ring of fire?", listOf("Total Solar Eclipse","Partial Solar Eclipse","Annular Solar Eclipse","Hybrid Solar Eclipse"), "Annular Solar Eclipse")
   , Question("When is the next annular solar eclipse in the United States?", listOf("April 8, 2024","October 14, 2023","May 30, 2022","August 11, 2025"), "October 14, 2023")
   , Question("What is a partial solar eclipse?", listOf("A solar eclipse when the Sun is completely covered by the Moon","A solar eclipse when the Moon passes behind the Earth","A solar eclipse when only a part of the Sun is covered, creating a crescent shape","A solar eclipse that occurs during the night"), "A solar eclipse when only a part of the Sun is covered, creating a crescent shape")
    )

    var currentQuestionIndex by remember { mutableStateOf(0) }
    var selectedAnswer by remember { mutableStateOf("") }
    var correctAnswersCount by remember { mutableStateOf(0) }
    var Count by remember { mutableStateOf(1) }

    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        Image(painter = painterResource(id = R.drawable.gp), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

        Column(
            modifier = Modifier
                .padding(16.dp)
                .offset(0.dp, 150.dp), verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (currentQuestionIndex < questions.size) {
                val currentQuestion = questions[currentQuestionIndex]
                Text(text = "Question ${Count}/10", color = colorResource(id = R.color.orange), fontSize = 27.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.offset(-30.dp,-105.dp))
                Text(text = "........................................................", color = colorResource(
                    id = R.color.orange,), fontSize = 13.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.offset(-8.dp,-95.dp)
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
                    colorResource(id = R.color.orange)),
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

    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top) {
        Image(painter = painterResource(id = R.drawable.cong) , contentDescription = "", modifier = Modifier
            .padding(top = 2.dp)
            .size(227.dp, 227.dp)
            .offset(0.dp, -20.dp))

        Text(text = "Quiz Score", fontSize = 40.sp, color = colorResource(id = R.color.orange), fontFamily = FontFamily(
            Font(R.font.popreg),
        ), fontWeight =   FontWeight.SemiBold)

        Text(text = "${correctAnswersCount}/10", fontSize = 40.sp, color = colorResource(id = R.color.white), fontFamily = FontFamily(
            Font(R.font.popreg),
        ), fontWeight =   FontWeight.SemiBold)
        Row (Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
            Button(onClick = { navController.navigate("SolarQuiz") }, colors = ButtonDefaults.buttonColors(colorResource(id = R.color.orange))) {
                Text(text = "Play Again", color = Color.Black, fontSize =18.sp)
                
            }
            Button(onClick = { navController.navigate("YoungScreen") }, colors = ButtonDefaults.buttonColors(colorResource(id = R.color.orange))) {
                Text(text = "Home", color = Color.Black, fontSize =18.sp)

            }
            
        }

    }
}
            }
        }
    }
}



