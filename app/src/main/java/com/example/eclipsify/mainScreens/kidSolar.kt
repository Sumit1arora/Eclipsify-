package com.example.eclipsify.mainScreens

import android.os.Build
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import androidx.navigation.NavHostController
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.example.eclipsify.R

@Composable
fun solarkidEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize())
    {


        Image(painter = painterResource(id = R.drawable.finalkid), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

    }


    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
            .offset()) {
        GifImage()
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="", modifier = Modifier.offset(15.dp,-380.dp).clickable { navController.navigate("KidScreen") }, tint = Color.White)

        Row(Modifier.offset(0.dp, -170.dp)) {
            Text(
                text = "Solar ",
                color = colorResource(id = R.color.gold),
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 21.dp, top = 31.dp)
            )
            Text(
                text = "Eclipse ",
                color = Color.White,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-6.dp)
            )
            Divider(
                color = colorResource(id = R.color.gold),
                modifier = Modifier.padding(top = 50.dp, end = 19.dp)
            )

        }
       
        Column(Modifier.offset(0.dp,-140.dp)) {


            Text(
                text = "A solar eclipse occurs when the Moon comes between the Sun and Earth, creating a shadow on Earth and blocking the Sun's light either partially or completely in certain areas. There are various kinds of solar eclipses.",
                color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                modifier = Modifier
                    .padding(top = 0.dp, start = 21.dp, end = 21.dp, bottom = 10.dp)
                ,
                textAlign = TextAlign.Justify
            )

            Row(Modifier) {
                Text(
                    text = "Total ",
                    color = colorResource(id = R.color.white),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 21.dp, top = 11.dp)
                )
                Text(
                    text = "Solar Eclipse ",
                    color = colorResource(id = R.color.gold),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(top = 11.dp)
                        .offset(-2.dp)
                )


            }
            Image(
                painter = painterResource(id = R.drawable.kidsolar), contentDescription = "",
                Modifier
                    .size(356.dp, 199.dp)
                    .offset(26.dp, 22.dp)
            )

            Text(
                text = "When the Sun, Earth, and Moon line up, the Earth blocks the Sun's light from reaching the Moon.",
                color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                modifier = Modifier
                    .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                    .offset(0.dp, 22.dp),
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.padding(top = 22.dp))
            Row {
                Text(
                    text = "Annular ",
                    color = colorResource(id = R.color.gold),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 15.dp, top = 31.dp)
                )
                Text(
                    text = "Solar Eclipse ",
                    color = colorResource(id = R.color.white),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(top = 31.dp)
                        .offset(-2.dp)
                )
                Divider(
                    color = colorResource(id = R.color.gold),
                    modifier = Modifier.padding(top = 47.dp, end = 19.dp)
                )

            }
            Text(
                text = "The Moon passes between the Sun and Earth, but it is too far away to cover the Sun completely. This creates a ring of sunlight around the Moon.",
                color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                modifier = Modifier
                    .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                    .offset(0.dp, -6.dp),
                textAlign = TextAlign.Justify
            )
            Image(
                painter = painterResource(id = R.drawable.anularkid), contentDescription = "",
                Modifier
                    .size(356.dp, 199.dp)
                    .offset(24.dp, 18.dp)
            )

            Spacer(modifier = Modifier.padding(top = 22.dp))

            Row {
                Text(
                    text = "Partial ",
                    color = colorResource(id = R.color.white),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(start = 21.dp, top = 31.dp)
                )
                Text(
                    text = "Solar Eclipse ",
                    color = colorResource(id = R.color.gold),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(top = 31.dp)
                        .offset(-2.dp)
                )



            }
            Image(
                painter = painterResource(id = R.drawable.partialkid), contentDescription = "",
                Modifier
                    .size(356.dp, 199.dp)
                    .offset(24.dp, 18.dp)
            )
            Text(
                text = "Partial solar eclipses happen when the Moon comes between the Sun and Earth, but the Moon only partially covers the Sun's disk.",
                color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                modifier = Modifier
                    .padding(top = 38.dp, start = 21.dp, end = 21.dp)
                    .offset(0.dp, -6.dp),
                textAlign = TextAlign.Justify
            )

            Spacer(modifier = Modifier.padding(top = 42.dp))
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

                Card(
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(start = 15.dp)
                        .clickable { navController.navigate("")}, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans)
                    )
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.upcome),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 18.dp, top = 15.dp)
                                .size(120.dp, 120.dp)
                        )
                        Text(
                            text = "Upcoming ",
                            color = colorResource(id = R.color.gold),
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 14.dp, top = 10.dp)
                        )
                        Text(
                            text = "Eclipses",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 23.dp)
                        )


                    }

                }
                Card(
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(start = 15.dp)
                        .clickable { navController.navigate("FindEclipse") },
                    colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans)
                    )
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.find),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 14.dp, top = 9.dp)
                                .size(136.dp, 136.dp)
                        )
                        Text(
                            text = "Find The",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 24.dp)
                        )
                        Text(
                            text = "Eclipse",
                            color = colorResource(id = R.color.gold),
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 33.dp)
                        )


                    }

                }
                Card(
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(start = 15.dp)
                        .clickable { navController.navigate("Comic") },
                    colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans)
                    )
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.comicicon),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 29.dp, top = 28.dp)
                                .size(100.dp, 100.dp)
                        )
                        Text(
                            text = "Comic",
                            color = colorResource(id = R.color.gold),
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 37.dp, top = 18.dp)
                        )
                        Text(
                            text = "Zone",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 47.dp)
                        )


                    }

                }
                Card(
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(start = 15.dp, end = 8.dp)
                        .clickable { navController.navigate("QuizKid")}, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans)
                    )
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.quiz),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 18.dp, top = 4.dp)
                                .size(126.dp, 126.dp)
                        )
                        Text(
                            text = "Play Fun",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 20.dp, top = 16.dp)
                        )
                        Text(
                            text = "  Quiz",
                            color = colorResource(id = R.color.gold),
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 30.dp)
                        )


                    }

                }
            }

        }


    }

}
@Composable
fun typesCarousel11(){

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
fun Component(modifier: Modifier = Modifier) {
    val checkedState = remember { mutableStateOf(true) }
    Switch(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it },
        modifier = modifier)
}

@Composable
fun GifImage(
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context).data(data = R.drawable.solargif).apply(block = {
                size(Size.ORIGINAL)
            }).build(), imageLoader = imageLoader
        ),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .size(250.dp, 400.dp)
            .offset(0.dp, -90.dp))
}
