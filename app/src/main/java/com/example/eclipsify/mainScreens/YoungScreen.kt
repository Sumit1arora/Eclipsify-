package com.example.eclipsify.mainScreens

import android.annotation.SuppressLint
import android.text.Layout.Alignment
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.eclipsify.R
import com.example.eclipsify.UserKidSwitch
import com.example.eclipsify.bars.MainBar
import com.example.eclipsify.elements.gallery
import com.example.eclipsify.elements.home
import com.example.eclipsify.elements.safety
import com.example.eclipsify.elements.videos

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun youngScreen(navController: NavHostController) {
     var isVisible by remember { mutableStateOf(true) }
    AnimatedVisibility(visible = isVisible, enter = fadeIn(animationSpec = tween(500)), exit = fadeOut(animationSpec = tween(500))) {


        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.newbg),
                contentDescription = "background",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )


            Column(
                modifier = Modifier
                    .fillMaxSize()


            ) {
                TopAppBar(modifier = Modifier
                    .fillMaxWidth()
                    .height(85.dp),
                    title = {
                        Box(
                            Modifier.fillMaxHeight(),
                            contentAlignment = androidx.compose.ui.Alignment.Center
                        )
                        {
                            Text(
                                "Hello, Stargazer!",
                                color = Color.White,
                                fontSize = 14.sp,
                                fontFamily = FontFamily(
                                    Font(R.font.lemedium)
                                )
                            )
                        }
                    },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(
                        containerColor = Color.White.copy(0.1f)
                    ),
                    actions = {
                        Box(
                            modifier = Modifier.padding(end = 17.dp, top = 20.dp)
                        ) {
                            var isChecked by remember { mutableStateOf(false) }
                            Switch(
                                checked = isChecked, onCheckedChange = {
                                    isChecked = it
                                    if (isChecked) {
                                        navController.navigate("KidScreen")
                                    }

                                }, colors = SwitchDefaults.colors(
                                    uncheckedTrackColor = colorResource(id = R.color.track),
                                    uncheckedThumbColor = colorResource(
                                        id = R.color.thumb
                                    )
                                )
                            )
                        }


                    }
                )

                Column(
                    Modifier
                        .fillMaxSize()
                        .verticalScroll(state = rememberScrollState())


                ) {
                    Spacer(modifier = Modifier.padding())
                    Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {


                        home()
                        gallery()
                        safety()
                        videos()


                    }
                    Text(
                        text = "Let's",
                        color = Color.White,
                        fontSize = 26.sp,
                        fontFamily = FontFamily(Font(R.font.lzsemibold)),
                        modifier = Modifier.padding(start = 15.dp, top = 40.dp)
                    )
                    Text(
                        text = "Explore",
                        color = colorResource(id = R.color.blueAcc),
                        fontSize = 26.sp, fontFamily = FontFamily(Font(R.font.lzsemibold)),
                        modifier = Modifier.padding(start = 15.dp)
                    )
                    Spacer(modifier = Modifier.padding(21.dp))

                    Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {

                        Card(
                            modifier = Modifier
                                .size(170.dp, 200.dp)
                                .padding(start = 15.dp)
                                .clickable { }, colors = CardDefaults.cardColors(
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
                                    color = colorResource(id = R.color.blueAcc),
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.lesemibold)),
                                    modifier = Modifier.padding(start = 22.dp, top = 22.dp)
                                )
                                Text(
                                    text = "Eclipses",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.lesemibold)),
                                    modifier = Modifier.padding(start = 32.dp)
                                )


                            }

                        }
                        Card(modifier = Modifier
                            .size(170.dp, 200.dp)
                            .padding(start = 15.dp),
                            elevation = CardDefaults.elevatedCardElevation(10.dp),
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
                                    color = colorResource(id = R.color.blueAcc),
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.lzsemibold)),
                                    modifier = Modifier.padding(start = 37.dp, top = 2.dp)
                                )
                                Text(
                                    text = "Eclipses",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.lzsemibold)),
                                    modifier = Modifier.padding(start = 19.5.dp)
                                )


                            }

                        }
                        Card(
                            modifier = Modifier
                                .size(170.dp, 200.dp)
                                .padding(start = 15.dp)
                                .clickable { }, colors = CardDefaults.cardColors(
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
                                    color = colorResource(id = R.color.blueAcc),
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.lzsemibold)),
                                    modifier = Modifier.padding(start = 37.dp, top = 22.dp)
                                )
                                Text(
                                    text = "Eclipses",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.lzsemibold)),
                                    modifier = Modifier.padding(start = 19.5.dp)
                                )


                            }

                        }
                        Card(
                            modifier = Modifier
                                .size(170.dp, 200.dp)
                                .padding(start = 15.dp, end = 8.dp)
                                .clickable { }, colors = CardDefaults.cardColors(
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
                                    color = colorResource(id = R.color.blueAcc),
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.lzsemibold)),
                                    modifier = Modifier.padding(start = 12.dp, top = 22.dp)
                                )
                                Text(
                                    text = "  Quiz",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.lzsemibold)),
                                    modifier = Modifier.padding(start = 22.dp)
                                )


                            }

                        }

                    }
                    Row {
                        Text(text = "What is ",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lesemibold)),
                            modifier = Modifier
                                .padding(start = 15.dp, top = 31.dp)
                                .clickable { })
                        Text(text = "Eclipse ",
                            color = colorResource(id = R.color.blueAcc),
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lesemibold)),
                            modifier = Modifier
                                .padding(start = 1.dp, top = 31.dp)
                                .clickable { })
                        Text(text = "?",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lzsemibold)),
                            modifier = Modifier
                                .padding(top = 31.dp)
                                .offset(-9.dp)
                                .clickable { })

                        Divider(
                            color = colorResource(id = R.color.blueAcc),
                            modifier = Modifier.padding(top = 46.dp, end = 18.dp)
                        )

                    }
                    Column() {
                        Box(modifier = Modifier
                            .fillMaxSize()
                            .clickable { navController.navigate("EclipseScreen") }) {


                            Text(
                                text = stringResource(id = R.string.Eclipse),
                                color = Color.White,
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.lelight)),
                                modifier = Modifier.padding(
                                    top = 18.dp,
                                    start = 15.dp,
                                    end = 18.dp
                                ),
                                textAlign = TextAlign.Left
                            )
                            Text(
                                text = "See all",
                                fontSize = 14.sp,
                                color = colorResource(id = R.color.blueAcc),
                                fontFamily = FontFamily(
                                    Font(R.font.lelight)
                                ),
                                modifier = Modifier
                                    .padding(start = 290.dp)
                                    .offset(-55.dp, 92.dp)
                            )
                        }
                    }
                    Column {
                        Divider(
                            color = colorResource(id = R.color.blueAcc),
                            modifier = Modifier.padding(start = 15.dp, top = 29.dp, end = 144.dp)
                        )
                        Text(
                            text = "Gallery",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lzsemibold)),
                            modifier = Modifier
                                .padding(start = 275.dp, top = 20.dp)
                                .offset(0.dp, -36.dp)
                        )
                        Gallery()


                    }
                    Row {
                        Text(text = "Quick Facts ",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lzsemibold)),
                            modifier = Modifier
                                .padding(start = 15.dp, top = 31.dp)
                                .clickable { })
                        Divider(
                            color = colorResource(id = R.color.blueAcc),
                            modifier = Modifier.padding(top = 46.dp, end = 18.dp)
                        )


                    }
                    Spacer(modifier = Modifier.padding(20.dp))


                }
            }
        }

    }



            }
@Composable
fun Carousel(){

}
@Composable
fun Gallery(){

    Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {

        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable { }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.upcoming) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 30.dp, top = 21.dp)
                        .size(96.dp, 97.dp))
            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable { }, colors = CardDefaults.cardColors(colorResource(id = R.color.trans)) ){
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.solar) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 7.dp, top = 4.dp)
                        .size(135.dp, 135.dp))




            }

        }
        Card(modifier = Modifier
            .size(170.dp, 200.dp)
            .padding(start = 15.dp)
            .clickable { }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.lunar) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 29.dp, top = 21.dp)
                        .size(96.dp, 97.dp))



            }

        }

    }
}






