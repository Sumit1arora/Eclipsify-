package com.example.eclipsify.spalshandlogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.eclipsify.R

@Preview
@Composable
fun SplashScreen() {
    Box(modifier = Modifier.fillMaxSize()
    )
    {
        Image(painter = painterResource(id = R.drawable.onboard1), contentDescription ="Splash", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Column(
            Modifier
                .fillMaxSize()
                .padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top) {
            Box {


                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier.size(317.dp, 221.dp)
                )
                Text(
                    text = "Embark on a celestial journey with us",
                    color = Color.White,
                    fontSize = 11.6.sp, modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 10.dp),
                    fontFamily = FontFamily(Font(R.font.lesemibold))
                )


            }
        }
    }

}