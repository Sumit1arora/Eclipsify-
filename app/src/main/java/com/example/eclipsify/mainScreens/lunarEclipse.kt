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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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
fun lunarEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black))
    {
        Image(
            painter = painterResource(id = R.drawable.gp),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        
        Box(modifier = Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(state = rememberScrollState())
        ) {


            Image(
                painter = painterResource(id = R.drawable.lunarmain),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="", modifier = Modifier.offset(15.dp,-310.dp).clickable { navController.navigate("YoungScreen") }, tint = Color.White)



            Row {
                Text(
                    text = "Lunar ",
                    color = colorResource(id = R.color.orange),
                    fontSize = 27.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 15.dp, top = 31.dp)
                )
                Text(
                    text = "Eclipse ",
                    color = Color.White,
                    fontSize = 27.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(top = 31.dp)
                        .offset(-6.dp)
                )
                Divider(
                    color = colorResource(id = R.color.orange),
                    modifier = Modifier.padding(top = 54.dp, end = 19.dp)
                )

            }

            Text(
                text = "Lunar eclipses occur at the full moon phase. When Earth is positioned precisely between the Moon and Sun, Earth’s shadow falls upon the surface of the Moon, dimming it and sometimes turning the lunar surface a striking red over the course of a few hours. Each lunar eclipse is visible from half of Earth.",
                color = Color.White,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.lelight)),
                modifier = Modifier.padding(top = 18.dp, start = 18.dp, end = 18.dp),
                textAlign = TextAlign.Justify
            )

            Row {
                Text(
                    text = "Total ",
                    color = colorResource(id = R.color.white),
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 15.dp, top = 31.dp)
                )
                Text(
                    text = "Lunar Eclipse ",
                    color = colorResource(id = R.color.orange),
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
            Image(
                painter = painterResource(id = R.drawable.totallunar), contentDescription = "",
                Modifier
                    .size(370.dp, 245.dp)
                    .offset(20.dp, 22.dp)
            )

            Text(
                text = "During a lunar eclipse, the Moon moves into Earth's shadow, but some sunlight still reaches it through Earth's atmosphere. The blue and violet light scatters away, but the red and orange light makes it through, giving the Moon a reddish appearance. The more dust or clouds in the atmosphere, the redder the Moon will appear.\n",
                color = Color.White,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.lelight)),
                modifier = Modifier
                    .padding(top = 18.dp, start = 18.dp, end = 18.dp)
                    .offset(0.dp, 22.dp),
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.padding(top = 22.dp))
            Row {
                Text(
                    text = "Partial ",
                    color = colorResource(id = R.color.orange),
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 15.dp, top = 31.dp)
                )
                Text(
                    text = "Lunar Eclipse ",
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
            Text(
                text = "An imperfect alignment of Sun, Earth and Moon results in the Moon passing through only part of Earth's umbra. The shadow grows and then recedes without ever entirely covering the Moon.",
                color = Color.White,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.lelight)),
                modifier = Modifier
                    .padding(top = 18.dp, start = 18.dp, end = 18.dp)
                    .offset(0.dp, -6.dp),
                textAlign = TextAlign.Justify
            )
            Image(
                painter = painterResource(id = R.drawable.paartial), contentDescription = "",
                Modifier
                    .size(390.dp, 215.dp)
                    .padding(start = 1.dp)
                    .offset(10.dp, 18.dp)
            )

            Spacer(modifier = Modifier.padding(top = 22.dp))

            Row {
                Text(
                    text = "Penumbral ",
                    color = colorResource(id = R.color.orange),
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 15.dp, top = 31.dp)
                )
                Text(
                    text = "Eclipse",
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
            Image(
                painter = painterResource(id = R.drawable.penu), contentDescription = "",
                Modifier
                    .size(390.dp, 233.dp)
                    .offset(11.dp, 18.dp)
            )

            Text(
                text = "If you don’t know this one is happening, you might miss it. The Moon travels through Earth’s penumbra, or the faint outer part of its shadow. The Moon dims so slightly that it can be difficult to notice.",
                color = Color.White,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.lelight)),
                modifier = Modifier
                    .padding(top = 18.dp, start = 18.dp, end = 18.dp)
                    .offset(0.dp, 22.dp),
                textAlign = TextAlign.Justify
            )

            Spacer(modifier = Modifier.padding(top = 72.dp))


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
                    color = colorResource(id = R.color.orange),
                    modifier = Modifier.padding(start = 15.dp, top = 47.dp, end = 19.dp)
                )

            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {

                Card(
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(start = 15.dp)
                        .clickable { navController.navigate("Upcoming") },
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
Spacer(modifier = Modifier.height(50.dp))
        }}}



