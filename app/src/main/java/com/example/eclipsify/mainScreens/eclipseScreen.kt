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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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


@Composable
fun whatEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.bcg), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())) {

            Image(painter = painterResource(id = R.drawable.whtecl),contentDescription ="", modifier = Modifier.fillMaxWidth() ,contentScale = ContentScale.FillWidth)

        Row {
            Text(text = "What is ",
                color = Color.White,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.lzsemibold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
                    )
            Text(text = "Eclipse ",
                color = colorResource(id = R.color.blueAcc),
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.lzsemibold)),
                modifier = Modifier
                    .padding(start = 1.dp, top = 31.dp)
                    )
            Text(text = "?",
                color = Color.White,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.lzsemibold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-9.dp)
                    )

        }

        Text(text= stringResource(id = R.string.Eclipse),
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp),
            textAlign = TextAlign.Left)
        Text(text= stringResource(id = R.string.Eclipse1),
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp),
            textAlign = TextAlign.Left)
        Text(text= stringResource(id = R.string.Eclipse3),
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp),
            textAlign = TextAlign.Left)
        Text(text = "Types: ",
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily(Font(R.font.lzsemibold)),
            modifier = Modifier
                .padding(start = 15.dp, top = 31.dp)
                )
        typesCarousel()
        Spacer(modifier = Modifier.padding(top = 130.dp))

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
                Text(text = "Solar", color = colorResource(id = R.color.blueAcc), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 43.dp, top = 2.dp))
                Text(text = "Eclipses", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 19.5.dp))



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
                Text(text = "Lunar", color = colorResource(id = R.color.blueAcc), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 37.dp, top = 22.dp))
                Text(text = "Eclipses", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)), modifier = Modifier.padding(start = 19.5.dp))



            }

        }



    }
}