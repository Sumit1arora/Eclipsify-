package com.example.eclipsify.eclipseGame

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.navigation.NavHostController
import com.example.eclipsify.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun findEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.finalkid),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
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
                        tint = Color.White, modifier = Modifier.clickable { navController.navigate("KidScreen") }
                    )
                }
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = Color.White.copy(0.1f)
            )
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.quizsc),
                contentDescription = "",
                modifier = Modifier.size(347.dp, 347.dp)
            )
            Text(
                text = "Welcome to the ",
                color = Color.White,
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center

            )
            Text(
                text = "exciting game of",
                color = Color.White,
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center, modifier = Modifier.offset(0.dp,-5.dp)

            )
            Text(text = "Find the Eclipse!",
                color = colorResource(id = R.color.gold),
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 5.dp).offset(0.dp,-5.9.dp)
                )

            Text(
                text = "Find the eclipse in jumbled images to \n earn points and proceed to the next \n image.",
                color = Color.White,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(top = 22.dp, bottom = 24.dp),
                textAlign = TextAlign.Center
            )
            Button(onClick = { navController.navigate("EclipseGame") }, modifier = Modifier
                .size(303.dp, 55.dp)
                .padding(top = 10.dp), colors = ButtonDefaults.buttonColors(colorResource(id = R.color.gold))) {
                Text(
                    text = "Let's Play",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.popreg)),
                    fontWeight = FontWeight.Bold
                )
                
            }


        }
    }
}