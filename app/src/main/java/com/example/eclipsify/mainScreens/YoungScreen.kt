package com.example.eclipsify.mainScreens

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.text.Layout.Alignment
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.FrameLayout
import android.widget.Toast
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.runtime.DisposableEffect
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
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
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.eclipsify.R
import com.example.eclipsify.UserKidSwitch
import com.example.eclipsify.bars.MainBar
import com.example.eclipsify.elements.home
import com.example.eclipsify.elements.quiz
import com.example.eclipsify.elements.safety
import com.example.eclipsify.elements.videos
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout.RESIZE_MODE_ZOOM
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.ui.StyledPlayerView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun youngScreen(navController: NavHostController) {
     var isVisible by remember { mutableStateOf(true) }
    AnimatedVisibility(visible = isVisible, enter = fadeIn(animationSpec = tween(500)), exit = fadeOut(animationSpec = tween(500))) {


        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)) {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(state = rememberScrollState())
            ) {
                Image(painter = painterResource(id = R.drawable.gp), contentDescription ="",modifier=Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()) {
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
                            modifier = Modifier.padding(end = 27.dp, top = 20.dp)
                        ) {
                            Row (verticalAlignment = androidx.compose.ui.Alignment.CenterVertically){
                                
                                Text(text = "User", fontSize = 10.sp, fontFamily = FontFamily(Font(R.font.leextrabold)))
                            
                            var isChecked by remember { mutableStateOf(false) }
                            Switch(modifier = Modifier.padding(start = 8.dp),
                                checked = isChecked, onCheckedChange = {
                                    isChecked = it
                                    if (isChecked) {
                                        navController.navigate("KidScreen")
                                    }

                                }, colors = SwitchDefaults.colors(
                                    uncheckedTrackColor = colorResource(id = R.color.track2),
                                    uncheckedThumbColor = colorResource(
                                        id = R.color.orange
                                    )
                                )
                            )
                                Text(text = "Kids", fontSize = 10.sp, fontFamily = FontFamily(Font(R.font.leextrabold)), modifier = Modifier.padding(start = 8.dp))

                            }
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
                        quiz(navController)
                        safety(navController)
                        videos()


                    }
                    Text(
                        text = "Let's",
                        color = Color.White,
                        fontSize = 26.sp,
                        fontFamily = FontFamily(Font(R.font.akirabold)),
                        modifier = Modifier.padding(start = 15.dp, top = 40.dp)
                    )
                    Text(
                        text = "Explore",
                        color = colorResource(id = R.color.orange),
                        fontSize = 26.sp, fontFamily = FontFamily(Font(R.font.akirabold)),
                        modifier = Modifier.padding(start = 15.dp)
                    )
                    Spacer(modifier = Modifier.padding(21.dp))

                    Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {


                        Card(
                            modifier = Modifier
                                .size(170.dp, 200.dp)
                                .padding(start = 15.dp)
                                .clickable { navController.navigate("AR") }, colors = CardDefaults.cardColors(
                                colorResource(id = R.color.trans)
                            )
                        ) {
                            Column(verticalArrangement = Arrangement.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.nn),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .padding(start = 30.dp, top = 21.dp)
                                        .size(96.dp, 97.dp)
                                )
                                Text(
                                    text = "AR ",
                                    color = colorResource(id = R.color.orange),
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.akirabold)),
                                    modifier = Modifier.padding(start = 62.dp, top = 22.dp)
                                )
                                Text(
                                    text = "Verse",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.akirabold)),
                                    modifier = Modifier.padding(start = 40.dp)
                                )


                            }

                        }

                        Card(
                            modifier = Modifier
                                .size(170.dp, 200.dp)
                                .padding(start = 15.dp)
                                .clickable { navController.navigate("Upcoming")}, colors = CardDefaults.cardColors(
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
                                    modifier = Modifier.padding(start = 11.dp, top = 22.dp, end = 12.dp)
                                )
                                Text(
                                    text = "Eclipses",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.akirabold)),
                                    modifier = Modifier.padding(start = 17.dp)
                                )


                            }

                        }
                        Card(modifier = Modifier
                            .size(170.dp, 200.dp)
                            .padding(start = 15.dp)

                            .clickable {navController.navigate("Myth") }, colors = CardDefaults.cardColors(colorResource(id = R.color.trans)) ){
                            Column(verticalArrangement = Arrangement.Center) {
                                Image(painter = painterResource(id = R.drawable.myth) , contentDescription = "",
                                    modifier = Modifier
                                        .padding(top = 18.dp, start = 24.dp)
                                        .size(105.dp, 101.dp))
                                Text(text = "Myth", color = colorResource(id = R.color.white), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 46.dp, top = 1.dp))
                                Text(text = "vs", color = colorResource(id = R.color.orange), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 59.dp, top = 1.dp))

                                Text(text = "Reality", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.akirabold)), modifier = Modifier.padding(start = 32.dp))



                            }

                        }
                        Card(modifier = Modifier
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
                                .clickable { navController.navigate("LunarEclipse") }, colors = CardDefaults.cardColors(
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
                                .clickable { navController.navigate("WhatQuiz") }, colors = CardDefaults.cardColors(
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
                    Row {
                        Text(text = "What is ",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier
                                .padding(start = 15.dp, top = 31.dp)
                                .clickable { })
                        Text(text = "Eclipse ",
                            color = colorResource(id = R.color.orange),
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
                                .padding(top = 34.dp)
                                .offset(-6.dp)
                                .clickable { })

                        Divider(
                            color = colorResource(id = R.color.orange),
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
                                textAlign = TextAlign.Justify
                            )
                            Text(
                                text = "See all",
                                fontSize = 14.sp,
                                color = colorResource(id = R.color.orange),
                                fontFamily = FontFamily(
                                    Font(R.font.lelight)
                                ),
                                modifier = Modifier
                                    .padding(start = 290.dp)
                                    .offset(-187.dp, 124.dp)
                            )
                        }
                    }
                    Column {
                        Divider(
                            color = colorResource(id = R.color.orange),
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
                        Gallery()


                    }
                    Row {
                        Text(text = "Quick Facts ",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier
                                .padding(start = 15.dp, top = 31.dp)
                                .clickable { })
                        Divider(
                            color = colorResource(id = R.color.orange),
                            modifier = Modifier.padding(top = 46.dp, end = 18.dp)
                        )


                    }
                    Spacer(modifier = Modifier.padding(6.dp))
                    val quickFact= listOf(
                        QuickFact("The next total solar " +
                                "eclipse in North America will occur on" +
                                " April 8, 2024.", painterResource(id = R.drawable.upcoming))
                        ,
                        QuickFact("The longest total lunar eclipse" +
                                " can last for up to 3 hours and 28 minutes.", image = painterResource(id = R.drawable.quick4)),
                        QuickFact("Eclipses can also occur on other planets and moons in our solar system.", image = painterResource(id = R.drawable.quick3))
                        , QuickFact("The first recorded solar eclipse was observed in China in 2134 BC.",
                            painterResource(id = R.drawable.quick2)),
                        QuickFact("The next total lunar eclipse will occur on October 28, 2023.", painterResource(id = R.drawable.quick1))

                    )
                    quickFactsScroll(quickFacts = quickFact)
Column(Modifier.clickable { navController.navigate("SafetyPrecautions") }) {


                    Row {
                        Text(text = "Safety Precautions ",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier
                                .padding(start = 15.dp, top = 31.dp)
                                .clickable { })
                        Divider(
                            color = colorResource(id = R.color.orange),
                            modifier = Modifier.padding(top = 46.dp, end = 18.dp)
                        )



                    }
                    Spacer(modifier = Modifier.padding(16.dp))
                    Card(
                        Modifier
                            .size(380.dp, 100.dp)
                            .padding(end = 20.dp)
                            .offset(10.dp), shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp, bottomStart = 18.dp, bottomEnd = 18.dp),colors = CardDefaults.cardColors(colorResource(id = R.color.trans))) {

                        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {


                            Text(
                                text = "Never look directly at the sun, except during the brief total phase of a total solar eclipse .", modifier = Modifier
                                    .width(250.dp)
                                    .padding(start = 20.dp, top = 13.dp),color = Color.White,
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.popreg)),
                                fontWeight = FontWeight.Light, textAlign = TextAlign.Justify
                            )
                            Image(painter = painterResource(id = R.drawable.safe1) , contentDescription ="", modifier = Modifier
                                .size(60.dp, 60.dp)
                                .offset(20.dp, 6.dp) )

                        }
                    }
                    Spacer(modifier = Modifier.padding(16.dp))

                    Card(
                        Modifier
                            .size(380.dp, 100.dp)
                            .padding(end = 20.dp)
                            .offset(18.dp), shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp, bottomStart = 18.dp, bottomEnd = 18.dp),colors = CardDefaults.cardColors(colorResource(id = R.color.trans))) {

                        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {

                            Image(painter = painterResource(id = R.drawable.safe2) , contentDescription ="", modifier = Modifier
                                .size(70.dp, 80.dp)
                                .padding(end = 10.dp)
                                .offset(20.dp, 6.dp) )
                            Text(
                                text = "Make an eclipse projector with a cardboard box, white paper, tape, scissors, and alluminium foil.", modifier = Modifier
                                    .width(270.dp)
                                    .padding(start = 10.dp, top = 18.dp)
                                    .offset(30.dp),color = Color.White,
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.popreg)),
                                fontWeight = FontWeight.Light,textAlign = TextAlign.Justify
                            )


                        }
                    }
                    Spacer(modifier = Modifier.padding(16.dp))

                    Card(
                        Modifier
                            .size(380.dp, 100.dp)
                            .padding(end = 20.dp)
                            .offset(10.dp), shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp, bottomStart = 18.dp, bottomEnd = 18.dp),colors = CardDefaults.cardColors(colorResource(id = R.color.trans))) {

                        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {


                            Text(
                                text = "Seek expert advice before using a solar filter with any optical device. ", modifier = Modifier
                                    .width(250.dp)
                                    .padding(start = 20.dp, top = 24.dp),color = Color.White,
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.popreg)),
                                fontWeight = FontWeight.Light, textAlign = TextAlign.Justify
                            )
                            Image(painter = painterResource(id = R.drawable.safe1) , contentDescription ="", modifier = Modifier
                                .size(60.dp, 60.dp)
                                .offset(20.dp, 16.dp) )

                        }

                    }


                    Spacer(modifier = Modifier.padding(26.dp))

                }
                    Row {
                        Text(text = "Beyond ",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier
                                .padding(start = 15.dp, top = 31.dp)
                                .clickable { })
                        Text(text = "Earth ",
                            color = colorResource(id = R.color.orange),
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier
                                .padding(start = 1.dp, top = 31.dp)
                                .clickable { })


                        Divider(
                            color = colorResource(id = R.color.orange),
                            modifier = Modifier.padding(top = 46.dp, end = 18.dp)
                        )

                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(text = "Explore the world of eclipse beyond Earth. Eclipses are not unique to Earth; they occur on other planets and moons within our solar system as well. ", color = Color.White, modifier = Modifier.padding(start = 15.dp,end=15.dp))
Row(modifier = Modifier
    .fillMaxWidth()
    .padding(top = 8.dp), horizontalArrangement = Arrangement.SpaceEvenly) {

   Card(modifier = Modifier
       .size(170.dp, 183.dp)
       .padding(), colors = CardDefaults.cardColors(colorResource(id = R.color.trans))) {
       Column(
           Modifier
               .fillMaxSize()
               .clickable { navController.navigate("Jupiter") }, verticalArrangement = Arrangement.Center, horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {


           Image(
               painter = painterResource(id = R.drawable.jupiter),
               contentDescription = "",
               modifier = Modifier.size(148.dp, 110.dp)
           )
           Text(
               text = "Eclipse on ",
               color = colorResource(id = R.color.white),
               fontSize = 15.sp,
               fontFamily = FontFamily(Font(R.font.akirabold)),

           )
           Text(
               text = "Jupiter",
               color = colorResource(id = R.color.orange),
               fontSize = 15.sp,
               fontFamily = FontFamily(Font(R.font.akirabold)),

           )
       }

   }
    Card(modifier = Modifier
        .size(170.dp, 183.dp)
        .padding(), colors = CardDefaults.cardColors(colorResource(id = R.color.trans))) {
        Column(
            Modifier
                .fillMaxSize()
                .clickable { navController.navigate("Mars") }, verticalArrangement = Arrangement.Center, horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {


            Image(
                painter = painterResource(id = R.drawable.mars),
                contentDescription = "",
                modifier = Modifier.size(148.dp, 110.dp)
            )
            Text(
                text = "Eclipse on ",
                color = colorResource(id = R.color.white),
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),

                )
            Text(
                text = "Mars",
                color = colorResource(id = R.color.orange),
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),

                )
        }

    }

}
            }

        }


    }

    }


}
@Composable
fun VideoBackground(
    resId: Int,
    modifier: Modifier = Modifier.fillMaxSize()
) {
    val context = LocalContext.current
    var player = remember {
        SimpleExoPlayer.Builder(context).build()
    }

    DisposableEffect(Unit) {
        player.setMediaItem(MediaItem.fromUri(
            Uri.parse("android.resource://${context.packageName}/$resId"))
        )
        player.playWhenReady = true
        player.repeatMode = Player.REPEAT_MODE_ONE
        player.prepare()
        onDispose {
            player.release()
        }
    }

    AndroidView(
        modifier = modifier.then(Modifier.background(Color.Black)),
        factory = { context ->
            PlayerView(context).apply {
                useController = false
                player = player
            }
        }
    )
}






@Composable
fun Gallery(){

    Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {

        Card(modifier = Modifier
            .size(204.dp, 108.dp)
            .padding(start = 15.dp)
            .clickable { }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.gal1) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 8.dp, top = 2.dp)
                        .offset(-4.9.dp)
                        .size(246.dp, 457.dp))
            }

        }
        Card(modifier = Modifier
            .size(204.dp, 108.dp)
            .padding(start = 15.dp)
            .clickable { }, colors = CardDefaults.cardColors(colorResource(id = R.color.trans)) ){
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.gal2) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 8.2.dp, top = 4.dp, bottom = 3.dp)
                        .size(175.dp, 345.dp))




            }

        }
        Card(modifier = Modifier
            .size(204.dp, 108.dp)
            .padding(start = 15.dp)
            .clickable { }, colors = CardDefaults.cardColors(
            colorResource(id = R.color.trans))) {
            Column(verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.gal3) , contentDescription = "",
                    modifier = Modifier
                        .padding(start = 2.3.dp, top = 1.dp)
                        .offset(4.dp)
                        .size(175.dp, 345.dp))



            }

        }

    }
}

@Composable
fun quickFactsScroll(quickFacts: List<QuickFact>) {
    LazyRow(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp))
    {
        items(quickFacts) { fact->
            QuickFactCard(fact)
        }
    }

}
data class QuickFact(val text:String,val image: Painter)
@Composable

fun QuickFactCard(fact: QuickFact){
    Card(
        Modifier
            .size(380.dp, 100.dp)
            .padding(end = 20.dp)
            .offset(10.dp), shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp, bottomStart = 18.dp, bottomEnd = 18.dp),colors = CardDefaults.cardColors(colorResource(id = R.color.trans))) {

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {


            Text(
                text = fact.text, modifier = Modifier
                    .width(250.dp)
                    .padding(start = 20.dp, top = 10.dp)
                    .wrapContentSize(androidx.compose.ui.Alignment.Center),color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                fontWeight = FontWeight.SemiBold
            )
            Image(painter = fact.image, contentDescription ="", modifier = Modifier
                .size(60.dp, 60.dp)
                .offset(20.dp, 6.dp) )

        }
    }
}






