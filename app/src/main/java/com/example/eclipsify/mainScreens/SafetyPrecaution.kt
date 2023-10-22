package com.example.eclipsify.mainScreens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
fun precautions(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black))
    {
        Image(painter = painterResource(id = R.drawable.gp), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())) {

        Image(painter = painterResource(id = R.drawable.precmain),contentDescription ="", modifier = Modifier.fillMaxWidth() ,contentScale = ContentScale.FillWidth)
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="", modifier = Modifier.offset(15.dp,-250.dp).clickable { navController.navigate("YoungScreen") }, tint = Color.Black)

        Row {
            Text(text = "Safety Precautions ",
                color = colorResource(id = R.color.white),
                fontSize = 27.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )

            Divider(
                color = colorResource(id = R.color.orange),
                modifier = Modifier.padding(top = 54.dp, end = 19.dp)
            )

        }

        Text(text= "Except during the brief total phase of a total solar eclipse, when the Moon completely blocks the Sun’s bright face, it is not safe to look directly at the Sun without specialized eye protection for solar viewing.\n" +
                "\n" +
                "Viewing any part of the bright Sun through a camera lens, binoculars, or a telescope without a special-purpose solar filter secured over the front of the optics will instantly cause severe eye injury.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp),
            textAlign = TextAlign.Justify)


        Image(painter = painterResource(id = R.drawable.prec1), contentDescription ="",
            Modifier
                .size(350.dp, 210.dp)
                .offset(20.dp, 22.dp) )
        Spacer(modifier = Modifier.padding(top = 22.dp))

        Image(painter = painterResource(id = R.drawable.prec2), contentDescription ="",
            Modifier
                .size(440.dp, 260.dp)
                .offset(-1.dp, 22.dp) )


        Spacer(modifier = Modifier.padding(top = 22.dp))
        Row {
            Text(text = "Skin ",
                color = colorResource(id = R.color.orange),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )
            Text(text = "Safety ",
                color = colorResource(id = R.color.white),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-2.dp)
            )
            Divider(
                color = colorResource(id = R.color.orange),
                modifier = Modifier.padding(top = 47.dp, end = 19.dp)
            )

        }
        Text(text= "Even during a partial or annular eclipse, or during the partial phases of a total eclipse, protect your skin from the sun by wearing sunscreen, a hat, and protective clothing.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier
                .padding(top = 18.dp, start = 18.dp, end = 18.dp)
                .offset(0.dp, -6.dp),
            textAlign = TextAlign.Justify)


        Spacer(modifier = Modifier.padding(top = 22.dp))

        Row (Modifier.padding(bottom = 20.dp)){

            Text(text = "Suggested ",
                color = colorResource(id = R.color.white),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(15.dp)
            )
            Divider(
                color = colorResource(id = R.color.orange),
                modifier = Modifier.padding(start = 15.dp, top = 47.dp, end = 19.dp)
            )

        }
        Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {

            Card(
                modifier = Modifier
                    .size(170.dp, 200.dp)
                    .padding(start = 15.dp)
                    .clickable {  },
                colors = CardDefaults.cardColors(
                    colorResource(id = R.color.trans)
                )
            ) {
                Column(verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.upcoming),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 30.dp, top = 21.dp)
                            .size(96.dp, 97.dp)
                    )
                    Text(
                        text = "Upcoming ",
                        color = colorResource(id = R.color.orange),
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.akirabold)),
                        modifier = Modifier.padding(start = 22.dp, top = 22.dp)
                    )
                    Text(
                        text = "Eclipses",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.akirabold)),
                        modifier = Modifier.padding(start = 32.dp)
                    )


                }

            }

            Card(
                modifier = Modifier
                    .size(170.dp, 200.dp)
                    .padding(start = 15.dp),
                onClick = { navController.navigate("SolarEclipse") },
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
                        color = colorResource(id = R.color.orange),
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
                    .clickable { navController.navigate("LunarEclipse") },
                colors = CardDefaults.cardColors(
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
                        color = colorResource(id = R.color.orange),
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
            Card(
                modifier = Modifier
                    .size(170.dp, 200.dp)
                    .padding(start = 15.dp, end = 8.dp)
                    .clickable {navController.navigate("WhatQuiz") }, colors = CardDefaults.cardColors(
                    colorResource(id = R.color.trans)
                )
            ) {
                Column(verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.facts),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 29.dp, top = 21.dp)
                            .size(96.dp, 97.dp)
                    )
                    Text(
                        text = "   Take ",
                        color = colorResource(id = R.color.orange),
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.akirabold)),
                        modifier = Modifier.padding(start = 12.dp, top = 22.dp)
                    )
                    Text(
                        text = "  Quiz",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.akirabold)),
                        modifier = Modifier.padding(start = 22.dp)
                    )


                }

            }


        }
        Spacer(modifier = Modifier.height(42.dp),




            )}}






@Composable
fun typesCarousel01(){

    Row(
        Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),horizontalArrangement = Arrangement.Center) {


        Card(modifier = Modifier
            .size(170.dp, 232.dp)

            .clickable { }, colors = CardDefaults.cardColors(colorResource(id = R.color.trans)) ){
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.solar) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 17.dp, top = 4.dp)
                        .size(135.dp, 135.dp))
                Text(text = "Solar", color = colorResource(id = R.color.orange), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 43.dp, top = 2.dp))
                Text(text = "Eclipses", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 19.5.dp))



            }

        }
        Card(modifier = Modifier
            .size(170.dp, 232.dp)
            .padding(start = 10.dp)
            .clickable { }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.lunar) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 32.dp, top = 21.dp)
                        .size(96.dp, 97.dp))
                Text(text = "Lunar", color = colorResource(id = R.color.orange), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 37.dp, top = 22.dp))
                Text(text = "Eclipses", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 19.5.dp))



            }

        }



    }
}


