package com.example.eclipsify.spalshandlogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eclipsify.R
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController


@Composable
fun onboard(navController: NavHostController){
    Box(modifier =Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.onbg),
            contentDescription ="", modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop )
    }
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(50.dp))
        Image(painter = painterResource(id = R.drawable.logo), contentDescription ="", modifier = Modifier.size(280.dp,280.dp) )

Text(text = "Explore The App", Modifier.offset(0.dp,-30.dp),color = Color.White, fontSize = 24.sp, fontFamily = FontFamily(Font(R.font.akirabold)) )
        Spacer(modifier = Modifier.height(25.dp))

        Text(text = "Your Cosmic Adventure Awaits! Delve into the enchanting world of eclipses with fun and educational content for kids and adults alike. Explore eclipse seasons, learn why eclipses happen, and witness the magic of celestial alignments.", color = Color.White,textAlign = TextAlign.Center, modifier = Modifier.width(332.dp).offset(0.dp,-30.dp), fontSize = 12.sp, fontFamily = FontFamily.SansSerif)
        Spacer(modifier = Modifier.height(25.dp))

        Button(onClick = { navController.navigate("Choice") }, modifier = Modifier
            .size(175.dp, 44.dp)
            , colors = ButtonDefaults.buttonColors(
            Color.White)) {
            Text(text = "Let's Begin", fontSize = 20.sp, color = colorResource(id = R.color.orange), fontFamily = FontFamily(Font(R.font.popreg)), fontWeight = FontWeight.SemiBold, modifier = Modifier.offset(0.dp,-2.dp))

        }
    }

}