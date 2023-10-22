package com.example.eclipsify.mainScreens


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
fun kidsupcomingEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.finalkid), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())) {

        Image(painter = painterResource(id = R.drawable.up),contentDescription ="", modifier = Modifier.fillMaxWidth() ,contentScale = ContentScale.FillWidth)
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="", modifier = Modifier.offset(15.dp,-190.dp).clickable { navController.navigate("KidScreen") }, tint = Color.Black)

        Row {
            Text(text = "Upcoming",
                color = colorResource(id = R.color.gold),
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )


            Text(text = "Eclipses",
                color = Color.White,
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 12.dp, top = 31.dp)
                    .offset(-6.dp)
            )
            Divider(
                color = colorResource(id = R.color.gold),
                modifier = Modifier.padding(top = 54.dp, end = 19.dp)
            )

        }
        Spacer(modifier = Modifier.height(14.dp))
        Row {
            Text(text = "Eclipses",
                color = colorResource(id = R.color.gold),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )


            Text(text = "in 2023",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 12.dp, top = 31.dp)
                    .offset(-6.dp)
            )
            Divider(
                color = colorResource(id = R.color.gold),
                modifier = Modifier.padding(top = 45.dp, end = 19.dp)
            )

        }

        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {

            Spacer(modifier = Modifier.height(8.dp))

            Card(colors = CardDefaults.cardColors(Color.Transparent), modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.kid1) , contentDescription ="" ,
                    Modifier
                        .size(358.dp, 190.dp)
                        .offset(24.dp))




            }
            Spacer(modifier = Modifier.height(14.dp))
            Row {
                Text(text = "Eclipses",
                    color = colorResource(id = R.color.gold),
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 15.dp, top = 31.dp)
                )


                Text(text = "in 2024",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 12.dp, top = 31.dp)
                        .offset(-6.dp)
                )
                Divider(
                    color = colorResource(id = R.color.gold),
                    modifier = Modifier.padding(top = 45.dp, end = 19.dp)
                )

            }

            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                Card(
                    colors = CardDefaults.cardColors(Color.Transparent),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kid2), contentDescription = "",
                        Modifier
                            .size(358.dp, 190.dp)
                            .offset(24.dp)
                    )


                }
                Spacer(modifier = Modifier.height(8.dp))

                Card(
                    colors = CardDefaults.cardColors(Color.Transparent),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kid3), contentDescription = "",
                        Modifier
                            .size(358.dp, 190.dp)
                            .offset(24.dp)
                    )


                }
                Spacer(modifier = Modifier.height(8.dp))

                Card(
                    colors = CardDefaults.cardColors(Color.Transparent),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kid4), contentDescription = "",
                        Modifier
                            .size(358.dp, 190.dp)
                            .offset(24.dp)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))



                Card(
                    colors = CardDefaults.cardColors(Color.Transparent),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kid5), contentDescription = "",
                        Modifier
                            .size(358.dp, 190.dp)
                            .offset(24.dp)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))



                Row {

                    Text(
                        text = "Suggested ",
                        color = colorResource(id = R.color.white),
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.akirabold)),
                        modifier = Modifier
                            .padding(top = 31.dp)
                            .offset(15.dp)
                    )
                    Divider(
                        color = colorResource(id = R.color.gold),
                        modifier = Modifier.padding(start = 15.dp, top = 47.dp, end = 19.dp)
                    )

                }
                Spacer(modifier = Modifier.height(32.dp))
                Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {



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
                }
                Spacer(modifier = Modifier.height(32.dp))

            }

            Spacer(modifier = Modifier.height(12.dp))
            }}}