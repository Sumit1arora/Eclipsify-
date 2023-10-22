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

@Composable
fun marsEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black))
    {
        Image(painter = painterResource(id = R.drawable.gp), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())) {

        Image(painter = painterResource(id = R.drawable.marsec),contentDescription ="", modifier = Modifier.fillMaxWidth() ,contentScale = ContentScale.FillWidth)
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="", modifier = Modifier.offset(15.dp,-250.dp).clickable { navController.navigate("YoungScreen") }, tint = Color.White)


        Row {
            Text(text = "Eclipse on  ",
                color = colorResource(id = R.color.orange),
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )
            Text(text = "Mars",
                color = Color.White,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-6.dp)
            )


        }

        Text(text= "The Perseverance Rover captured Mars’s moon Phobos crossing in front of the Sun on April 20, 2022. Phobos is about 16 miles across, so it only covers a small portion of the Sun’s disk. Because the edges of the Sun are still visible, this would be considered an annular eclipse.",
            color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp),
            textAlign = TextAlign.Justify)


        Image(painter = painterResource(id = R.drawable.marsc2  ), contentDescription ="",
            Modifier
                .size(390.dp, 215.dp)
                .offset(11.dp, 22.dp) )

        Text(text= "Several Mars rovers have observed Phobos crossing in front of the Sun over the past 18 years. Spirit and Opportunity made the first time lapse photos of phobos back in 2004; Curiosity was the first to record video of the event.",
            color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier
                .padding(top = 18.dp, start = 18.dp, end = 18.dp)
                .offset(0.dp, 22.dp),
            textAlign = TextAlign.Justify)

        Spacer(modifier = Modifier.padding(top = 22.dp))
        Image(painter = painterResource(id = R.drawable.solarmarsimg  ), contentDescription ="",
            Modifier
                .size(390.dp, 343.dp)
                .offset(11.dp, 22.dp) )
        Spacer(modifier = Modifier.padding(top = 22.dp))

        Text(text= "Each time these eclipses are observed, they allow scientists to measure subtle shifts in Phobos’ orbit over time. The moon’s tidal forces pull on the deep interior of the Red Planet, as well as its crust and mantle; studying how much Phobos shifts over time reveals something about how resistant the crust and mantle are, and thus what kinds of materials they’re made of.",
            color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier
                .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                .offset(0.dp, -6.dp),
            textAlign = TextAlign.Justify)





        Spacer(modifier = Modifier.padding(top = 19.dp))
        Image(painter = painterResource(id = R.drawable.marsc3), contentDescription ="",
            Modifier
                .size(390.dp, 215.dp)
                .offset(1.dp, 18.dp) )
        Spacer(modifier = Modifier.padding(top = 22.dp))
        Text(text= "Mars has two moons, both small moons orbiting closely, and so will see frequent lunar eclipses. They’ll usually be total or penumbral eclipses.\n" +
                "\n" +
                "As for solar eclipses, the moons are so small that they’ll be more like transits than eclipses",
            color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier
                .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                .offset(0.dp, -6.dp),
            textAlign = TextAlign.Justify)


        Spacer(modifier = Modifier.padding(top = 72.dp))


    }





}
@Composable
fun typesCarousel(){

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



    }}

