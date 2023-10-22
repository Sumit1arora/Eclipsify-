package com.example.eclipsify.Quiz

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.eclipsify.R

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun quizMain(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.finalkid) , contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        TopAppBar(
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            title = {
                Box(
                    Modifier.fillMaxHeight(),
                    contentAlignment = Alignment.Center
                )
                {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "",
                        tint = Color.White, modifier = Modifier.clickable {  navController.navigate("KidScreen")}
                    )
                }
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = Color.White.copy(0.1f)
            )
        )
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "PLAY FUN QUIZ", fontSize =24.sp, color = Color.White, fontFamily = FontFamily(
                Font(R.font.akirabold)
            ))
            Image(painter = painterResource(id =R.drawable.quizm), contentDescription ="", modifier = Modifier.size(310.dp,433.dp   ) )
            Button(onClick = { navController.navigate("KidQuiz") }, colors = ButtonDefaults.buttonColors(colorResource(id = R.color.gold))) {
                Text(text = "Start Quiz", color = Color.Black, fontFamily = FontFamily(Font(R.font.lexend)), fontWeight = FontWeight.SemiBold,fontSize = 20.sp)
            }
        }
    }

}