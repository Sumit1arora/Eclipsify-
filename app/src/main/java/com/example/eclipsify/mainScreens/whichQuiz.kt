package com.example.eclipsify.mainScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
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
import androidx.navigation.NavHostController
import com.example.eclipsify.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun optionQuiz(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)){
        Image(painter = painterResource(id = R.drawable.gp), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop )

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(90.dp))
        Text(text = "Choose the Quiz", color = Color.White, fontSize = 32.sp, fontFamily = FontFamily(
            Font(R.font.popreg)), fontWeight = FontWeight.SemiBold
        )
            Spacer(modifier = Modifier.height(80.dp))

            Card(modifier = Modifier.size(208.dp,248.dp), colors = CardDefaults.cardColors(
              colorResource(id = R.color.trans)), onClick = {navController.navigate("SolarQuiz")}){
                Image(painter = painterResource(id = R.drawable.solar), contentDescription ="", modifier = Modifier.size(200.dp,200.dp), contentScale = ContentScale.Fit )
                Text(text = "Solar Quiz", color = Color.White, fontSize = 24.sp, fontFamily = FontFamily(
                    Font(R.font.popreg)), fontWeight = FontWeight.SemiBold, modifier = Modifier.offset(42.dp))          }
            Spacer(modifier = Modifier.height(40.dp))

            Card(modifier = Modifier.size(208.dp,248.dp), colors = CardDefaults.cardColors(
                colorResource(id = R.color.trans)), onClick = {navController.navigate("LunarQuiz")}){
                Image(painter = painterResource(id = R.drawable.lunar), contentDescription ="", modifier = Modifier
                    .size(150.dp, 150.dp)
                    .padding(top = 20.dp)
                    .offset(30.dp), contentScale = ContentScale.Fit )
                Text(text = "Lunar Quiz", color = Color.White, fontSize = 24.sp, fontFamily = FontFamily(
                    Font(R.font.popreg)), fontWeight = FontWeight.SemiBold, modifier = Modifier.offset(42.dp,40.dp))          }

        }
    }
    
}