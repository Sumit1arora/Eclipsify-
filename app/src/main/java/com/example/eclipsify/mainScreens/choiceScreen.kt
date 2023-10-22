package com.example.eclipsify.mainScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eclipsify.R


@Composable
fun Choice(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black))
    {
        Image(painter = painterResource(id = R.drawable.choice), contentDescription ="",Modifier.fillMaxSize(), contentScale = ContentScale.Crop )

    }
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top,horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "CHOOSE PROFILE",
            color = Color.White,
            fontSize = 26.sp,
            fontFamily = FontFamily(Font(R.font.akirabold)),
            modifier = Modifier.padding(start = 15.dp, top = 70.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Image(painter = painterResource(id = R.drawable.user), contentDescription ="",
            Modifier
                .size(165.dp, 220.dp)
                .clickable { navController.navigate("YoungScreen") } )
        Spacer(modifier = Modifier.height(50.dp))

        Image(painter = painterResource(id = R.drawable.kid), contentDescription ="",
            Modifier
                .size(165.dp, 220.dp)
                .clickable { navController.navigate("KidScreen") } )

    }
    
}