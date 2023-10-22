package com.example.eclipsify.mainScreens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
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
fun eclipseGame4(navController: NavHostController) {
    var visible by remember{ mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize()){
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
                        tint = Color.White
                    )
                }
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = Color.White.copy(0.1f)
            )
        )
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Click on the Eclipse in \n the image below",
                color = Color.White,
                fontSize = 32.sp,
                fontFamily = FontFamily(
                    Font(R.font.popreg)
                ), fontWeight = FontWeight.Medium, textAlign = TextAlign.Center, modifier = Modifier.offset(0.dp,-66.dp)
            )
            Box(
                Modifier
                    .size(354.dp, 354.dp)
                    .border(9.dp, Color.White)) {

                Image(
                    painterResource(id = R.drawable.game4),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally){

            AnimatedVisibility(visible) {
                Button(onClick = { /*TODO*/ }, modifier = Modifier
                    .size(303.dp, 55.dp)
                    .offset(0.dp, -80.dp)
                    .padding(bottom = 10.dp), colors = ButtonDefaults.buttonColors(colorResource(id = R.color.gold))) {
                    Text(
                        text = "Submit",
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.popreg)),
                        fontWeight = FontWeight.Bold
                    )

                }
                OutlinedCard(
                    Modifier
                        .size(75.dp, 75.dp).offset(53.dp,-410.dp)
                        .border(2.dp, color = Color.Green), colors = CardDefaults.cardColors(Color.Transparent)) {

                }
            }

        }


        Image(painter = painterResource(id = R.drawable.eclipseee), contentDescription ="",
            Modifier
                .offset(45.dp, 320.dp)
                .size(190.dp, 190.dp)
                .clickable { visible = !visible })}




}

