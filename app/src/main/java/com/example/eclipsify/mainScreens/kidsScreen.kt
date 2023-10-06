package com.example.eclipsify.mainScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eclipsify.R
import com.example.eclipsify.bars.MainBar
import com.example.eclipsify.bars.kidBar
import com.example.eclipsify.elements.kidcomic
import com.example.eclipsify.elements.kidhome
import com.example.eclipsify.elements.kidsafety
import com.example.eclipsify.elements.kidvideos


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun kidScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()){


        Image(painter = painterResource(id = R.drawable.finalkid), contentDescription ="kid", Modifier.fillMaxSize(),contentScale = ContentScale.Crop )

    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())) {
        TopAppBar(modifier = Modifier
            .fillMaxWidth()
            .height(85.dp),
            title = {
                Box(
                    Modifier.fillMaxHeight(),
                    contentAlignment = Alignment.Center
                )
                {
                    Text(
                        "Kids Zone",
                        color = colorResource(id = R.color.gold),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            Font(R.font.lemedium)
                        )
                    )

                }
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = colorResource(id = R.color.trans)
            ),
            actions = {
                 Box(
                    modifier = Modifier.padding(end =17.dp, top = 20.dp)
                ) {
                    var isChecked by remember { mutableStateOf(true) }
                    Switch(checked = isChecked, onCheckedChange ={isChecked=it
                        if (!isChecked){
                            navController.navigate("YoungScreen")
                        }

                    }, modifier = Modifier,colors = SwitchDefaults.colors(
                        checkedThumbColor = colorResource(id = R.color.gold), checkedTrackColor = colorResource(
                            id = R.color.track
                        ))
                    )
                }


            }
        )
        Box(Modifier){
            Image(painter = painterResource(id = R.drawable.astro), contentDescription ="",modifier= Modifier
                .size(60.dp, 80.dp)
                .padding()
                .offset(13.dp, -40.dp))
            Row(Modifier.padding(top = 30.dp)) {
                kidhome()
                kidcomic()
                kidsafety()
                kidvideos()
            }

        }



        Text(
            text = "Let's",
            color = Color.White,
            fontSize = 26.sp,
            fontFamily = FontFamily(Font(R.font.lzsemibold)),
            modifier = Modifier
                .padding(start = 23.dp,)
                .offset(0.dp, 30.dp)
        )
        Text(text = "Explore",
            color = colorResource(id = R.color.gold),
            fontSize = 26.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)),
            modifier = Modifier
                .padding(start = 23.dp)
                .offset(0.dp, 30.dp))

        Image(
            painter = painterResource(id = R.drawable.astroo),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp, 100.dp)
                .offset(340.dp, -80.dp)
        )



    Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {

        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable { }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.upcome) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 18.dp, top = 15.dp)
                        .size(120.dp, 120.dp))
                Text(text = "Upcoming ", color = colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 14.dp, top = 10.dp))
                Text(text = "Eclipses", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 23.dp))



            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable { navController.navigate("FindEclipse")}, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.find) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 14.dp, top = 9.dp)
                        .size(136.dp, 136.dp))
                Text(text = "Find The", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 24.dp))
                Text(text = "Eclipse", color=colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 33.dp))



            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable { }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.comicicon) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 29.dp, top = 28.dp)
                        .size(100.dp, 100.dp))
                Text(text = "Comic", color = colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 37.dp, top = 18.dp))
                Text(text = "Zone", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 47.dp))



            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp, end = 8.dp)
            .clickable { }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.quiz) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 18.dp, top = 4.dp)
                        .size(126.dp, 126.dp))
                Text(text = "Play Fun", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 20.dp, top = 16.dp))
                Text(text = "  Quiz", color = colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 30.dp))



            }

        }
    }

    }
    
}