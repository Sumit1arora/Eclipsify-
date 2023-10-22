package com.example.eclipsify.mainScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.Divider
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eclipsify.R
import com.example.eclipsify.bars.MainBar
import com.example.eclipsify.elements.kidhome
import com.example.eclipsify.elements.kidlunar
import com.example.eclipsify.elements.kidsafety
import com.example.eclipsify.elements.kidsolar


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
                     Row(verticalAlignment = Alignment.CenterVertically) {


                     var isChecked by remember { mutableStateOf(true) }
                         Text(text = "User", fontSize = 10.sp, fontFamily = FontFamily(Font(R.font.leextrabold)))

                         Switch(
                         checked = isChecked, onCheckedChange = {
                             isChecked = it
                             if (!isChecked) {
                                 navController.navigate("YoungScreen")
                             }

                         }, modifier = Modifier.padding(start = 8.dp), colors = SwitchDefaults.colors(
                             checkedThumbColor = colorResource(id = R.color.gold),
                             checkedTrackColor = colorResource(
                                 id = R.color.track
                             )
                         )
                     )
                         Text(text = "Kids", fontSize = 10.sp, fontFamily = FontFamily(Font(R.font.leextrabold)), modifier = Modifier.padding(start = 8.dp))

                     }
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
                kidsolar(navController)
                kidsafety()
                kidlunar(navController)
            }

        }



        Text(
            text = "Let's",
            color = Color.White,
            fontSize = 26.sp,
            fontFamily = FontFamily(Font(R.font.akirabold)),
            modifier = Modifier
                .padding(start = 23.dp,)
                .offset(0.dp, 30.dp)
        )
        Text(text = "Explore",
            color = colorResource(id = R.color.gold),
            fontSize = 26.sp, fontFamily = FontFamily(Font(R.font.akirabold)),
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



    Row(modifier = Modifier
        .horizontalScroll(state = rememberScrollState())
        .offset(0.dp, -32.dp)) {

        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable {navController.navigate("KidsUpcoming") }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.upcome) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 18.dp, top = 15.dp)
                        .size(120.dp, 120.dp))
                Text(text = "Upcoming ", color = colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 14.dp, top = 10.dp))
                Text(text = "Eclipses", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 23.dp))



            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable { navController.navigate("FindEclipse") }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.find) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 14.dp, top = 9.dp)
                        .size(136.dp, 136.dp))
                Text(text = "Find The", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 24.dp))
                Text(text = "Eclipse", color=colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 33.dp))



            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable { navController.navigate("Comic") }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.comicicon) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 29.dp, top = 28.dp)
                        .size(100.dp, 100.dp))
                Text(text = "Comic", color = colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 37.dp, top = 18.dp))
                Text(text = "Zone", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 47.dp))



            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp, end = 8.dp)
            .clickable {navController.navigate("QuizKid") }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.quiz) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 18.dp, top = 4.dp)
                        .size(126.dp, 126.dp))
                Text(text = "Play Fun", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 20.dp, top = 16.dp))
                Text(text = "  Quiz", color = colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 30.dp))



            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp),
            onClick = { navController.navigate("KidSolar") },
            colors = CardDefaults.cardColors(colorResource(id = R.color.trans))
        ) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = R.drawable.solar),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 7.dp, top = 4.dp)
                        .size(135.dp, 135.dp)
                )
                Text(
                    text = "Solar",
                    color = colorResource(id = R.color.gold),
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier.padding(start = 37.dp, top = 2.dp)
                )
                Text(
                    text = "Eclipses",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier.padding(start = 19.5.dp)
                )


            }

        }
        Card(
            modifier = Modifier
                .size(170.dp, 200.dp)
                .padding(start = 15.dp)
                .clickable { navController.navigate("KidLunar")}, colors = CardDefaults.cardColors(
                colorResource(id = R.color.trans)
            )
        ) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = R.drawable.lunar),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 29.dp, top = 21.dp)
                        .size(96.dp, 97.dp)
                )
                Text(
                    text = "Lunar",
                    color = colorResource(id = R.color.gold),
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier.padding(start = 37.dp, top = 22.dp)
                )
                Text(
                    text = "Eclipses",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier.padding(start = 19.5.dp)
                )


            }

        }
    }
        Row(Modifier.offset(0.dp,-25.dp)) {
            Text(text = "What is ",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
                    .clickable { })
            Text(text = "Eclipse ",
                color = colorResource(id = R.color.gold),
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 1.dp, top = 31.dp)
                    .clickable { })
            Text(text = "?",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-9.dp)
                    .clickable { })

            Divider(
                color = colorResource(id = R.color.gold),
                modifier = Modifier.padding(top = 46.dp, end = 18.dp)
            )

        }
        Column(Modifier.offset(0.dp,-10.dp)) {
            Box(modifier = Modifier
                .fillMaxSize()
                .clickable { navController.navigate("KidEclipse") }
            ) {


                Text(
                    text = "An eclipse is an astronomical event that occurs when the view of an object is temporarily obscured, cast into a shadow, or even completely concealed. Eclipses occur during a syzygy, or when astronomical objects reach an alignment. ",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.lelight)),
                    modifier = Modifier.padding(
                        top = 18.dp,
                        start = 15.dp,
                        end = 18.dp
                    ),
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "See all.",
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.gold),
                    fontFamily = FontFamily(
                        Font(R.font.lelight)
                    ),
                    modifier = Modifier
                        .padding(start = 290.dp)
                        .offset(-170.dp, 177.dp)
                )
            }
        }
        Column {
            Divider(
                color = colorResource(id = R.color.gold),
                modifier = Modifier.padding(start = 15.dp, top = 29.dp, end = 144.dp)
            )
            Text(
                text = "Gallery",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 275.dp, top = 20.dp)
                    .offset(0.dp, -36.dp)
            )



                Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {

                    Card(modifier = Modifier
                        .size(264.dp, 178.dp)
                        .padding(start = 15.dp)
                        .clickable { }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(verticalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.kidc1) , contentDescription = "",
                                modifier = Modifier
                                    .padding(start = 15.dp, top = 2.dp)
                                    .offset(-4.9.dp)
                                    .size(226.dp, 457.dp))
                        }

                    }
                    Card(modifier = Modifier
                        .size(264.dp, 178.dp)
                        .padding(start = 15.dp)
                        .clickable { }, colors = CardDefaults.cardColors(colorResource(id = R.color.trans)) ){
                        Column(verticalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.kidc2) , contentDescription = "",
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 4.dp, bottom = 3.dp)
                                    .size(226.dp, 457.dp))




                        }

                    }
                    Card(modifier = Modifier
                        .size(264.dp, 178.dp)
                        .padding(start = 15.dp)
                        .clickable { }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(verticalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.kidc3) , contentDescription = "",
                                modifier = Modifier
                                    .padding(start = 8.dp, top = 1.dp)
                                    .offset(4.dp)
                                    .size(226.dp, 345.dp))



                        }

                    }
                    Card(modifier = Modifier
                        .size(264.dp, 178.dp)
                        .padding(start = 15.dp)
                        .clickable { }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(verticalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.kidc4) , contentDescription = "",
                                modifier = Modifier
                                    .padding(start = 8.dp, top = 1.dp)
                                    .offset(4.dp)
                                    .size(226.dp, 345.dp))



                        }

                    }

                }
            Spacer(modifier = Modifier.height(70.dp))
            }



        }

    }
    
