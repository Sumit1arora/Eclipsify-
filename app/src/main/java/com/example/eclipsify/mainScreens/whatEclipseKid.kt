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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
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
fun whatEclipseKid(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black))
    {

        Image(
            painter = painterResource(id = R.drawable.finalkid),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(state = rememberScrollState())
        ) {
            Image(
                painter = painterResource(id = R.drawable.maineclipse),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "",
                modifier = Modifier.offset(15.dp, -270.dp).clickable { navController.navigate("KidScreen") },
                tint = Color.White
            )


            Row {
                Text(
                    text = "What is ",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 21.dp, top = 31.dp)
                )
                Text(
                    text = "Eclipse ",
                    color = colorResource(id = R.color.gold),
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 1.dp, top = 31.dp)
                )
                Text(
                    text = "?",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(top = 31.dp)
                        .offset(-9.dp)
                )

            }

            Text(
                text = "An eclipse is an astronomical event that occurs when the view of an object is temporarily obscured, cast into a shadow, or even completely concealed. Eclipses occur during a syzygy, or when astronomical objects reach an alignment. Eclipses can either be partial or total eclipses depending on the sizes, distances of the objects, and the viewer. ",
                color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                modifier = Modifier.padding(top = 18.dp, start = 21.dp, end = 21.dp),
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.height(8.dp))

            Image(
                painter = painterResource(id = R.drawable.mainecl),
                contentDescription = "",
                modifier = Modifier
                    .size(370.dp, 252.dp)
                    .offset(20.dp, 10.dp)
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = "Types: ",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 21.dp, top = 31.dp)
            )
            Divider(
                color = colorResource(id = R.color.gold),
                modifier = Modifier
                    .padding(start = 130.dp, top = 0.dp, end = 12.dp)
                    .offset(0.dp, -12.dp)
            )
            typesCarousel1(navController)

            Spacer(modifier = Modifier.padding(top = 30.dp))

        }


    }
}
@Composable
fun typesCarousel1(navController: NavHostController){

    Row(
        Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),horizontalArrangement = Arrangement.SpaceEvenly) {


        Card(modifier = Modifier
            .size(170.dp, 210.dp)

            .clickable { navController.navigate("KidSolar") }, colors = CardDefaults.cardColors(colorResource(id = R.color.trans)) ){
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.solar) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 17.dp, top = 4.dp)
                        .size(135.dp, 135.dp))
                Text(text = " Solar", color = colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 43.dp, top = 2.dp))
                Text(text = " Eclipses", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 21.5.dp))



            }

        }

        Card(modifier = Modifier
            .size(170.dp, 210.dp)
            .offset(10.dp)
            .clickable { navController.navigate("KidLunar") }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.lunar) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 37.dp, top = 21.dp)
                        .size(96.dp, 97.dp))
                Text(text = " Lunar", color = colorResource(id = R.color.gold), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 37.dp, top = 22.dp))
                Text(text = " Eclipses", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 19.5.dp))



            }

        }



    }
}