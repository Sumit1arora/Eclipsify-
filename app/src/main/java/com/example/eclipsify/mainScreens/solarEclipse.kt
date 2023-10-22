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
fun solarEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black))
    {
        Image(painter = painterResource(id = R.drawable.gp), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())) {

        Image(painter = painterResource(id = R.drawable.solarr),contentDescription ="", modifier = Modifier.fillMaxWidth() ,contentScale = ContentScale.FillWidth)
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="", modifier = Modifier.offset(15.dp,-320.dp).clickable { navController.navigate("YoungScreen") }, tint = Color.White)

        Row {
            Text(text = "Solar ",
                color = colorResource(id = R.color.orange),
                fontSize = 27.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 21.dp, top = 31.dp)
            )
            Text(text = "Eclipse ",
                color = Color.White,
                fontSize = 27.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-6.dp)
            )


        }

        Text(text= "A solar eclipse happens when the Moon moves between the Sun and Earth, casting a shadow on Earth, fully or partially blocking the Sun’s light in some areas. There are different types of solar eclipses.",
            color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier.padding(top = 18.dp, start = 21.dp,end=21.dp),
            textAlign = TextAlign.Justify)

        Row {
            Text(text = "Total ",
                color = colorResource(id = R.color.white),
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 21.dp, top = 32.dp)
            )
            Text(text = "Solar Eclipse ",
                color = colorResource(id = R.color.orange),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-2.dp)
            )


        }
        Image(painter = painterResource(id = R.drawable.totalsolar), contentDescription ="",
            Modifier
                .size(390.dp, 215.dp)
                .offset(11.dp, 22.dp) )

        Text(text= "A solar eclipse happens when the Moon moves between the Sun and Earth, casting a shadow on Earth, fully or partially blocking the Sun’s light in some areas. There are different types of solar eclipses.",
            color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier
                .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                .offset(0.dp, 22.dp),
            textAlign = TextAlign.Justify)
        Spacer(modifier = Modifier.padding(top = 22.dp))
        Row {
            Text(text = "Annular ",
                color = colorResource(id = R.color.orange),
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 21.dp, top = 31.dp)
            )
            Text(text = "Solar Eclipse ",
                color = colorResource(id = R.color.white),
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-2.dp)
            )


        }
        Text(text= "A solar eclipse happens when the Moon moves between the Sun and Earth, casting a shadow on Earth, fully or partially blocking the Sun’s light in some areas. There are different types of solar eclipses.",
            color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier
                .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                .offset(0.dp, -6.dp),
            textAlign = TextAlign.Justify)
        Image(painter = painterResource(id = R.drawable.annular), contentDescription ="",
            Modifier
                .size(390.dp, 215.dp)
                .offset(11.dp, 18.dp) )

        Spacer(modifier = Modifier.padding(top = 22.dp))

        Row {
            Text(text = "Partial ",
                color = colorResource(id = R.color.orange),
                fontSize =18.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 21.dp, top = 31.dp)
            )
            Text(text = "Solar Eclipse ",
                color = colorResource(id = R.color.white),
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-2.dp)
            )


        }
        Text(text= "A solar eclipse happens when the Moon moves between the Sun and Earth, casting a shadow on Earth, fully or partially blocking the Sun’s light in some areas. There are different types of solar eclipses.",
            color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier
                .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                .offset(0.dp, -6.dp),
            textAlign = TextAlign.Justify)
        Spacer(modifier = Modifier.padding(top = 39.dp))

        Button(onClick = {  }, modifier = Modifier
            .size(353.dp, 44.dp)
            .offset(28.dp), colors = ButtonDefaults.buttonColors(
            Color.White)) {
            Text(text = "Start Quiz", fontSize = 20.sp, color = colorResource(id = R.color.orange), fontFamily = FontFamily(Font(R.font.popreg)), fontWeight = FontWeight.SemiBold, modifier = Modifier.offset(0.dp,-2.dp))

        }
        Spacer(modifier = Modifier.padding(top = 72.dp))


    }





}
@Composable
fun typesCarousel1(){

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
@Composable
fun Component1(modifier: Modifier = Modifier) {
    val checkedState = remember { mutableStateOf(true) }
    Switch(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it },
        modifier = modifier)
}

@Preview(widthDp = 53, heightDp = 23)
@Composable
private fun Component1Preview() {
    Component1(Modifier)
}