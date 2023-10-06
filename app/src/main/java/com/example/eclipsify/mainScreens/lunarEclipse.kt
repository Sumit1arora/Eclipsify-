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
import androidx.compose.material3.Divider
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
fun lunarEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.ecli), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())) {

        Image(painter = painterResource(id = R.drawable.lunarmain),contentDescription ="", modifier = Modifier.fillMaxWidth() ,contentScale = ContentScale.FillWidth)

        Row {
            Text(text = "Lunar ",
                color = colorResource(id = R.color.blueAcc),
                fontSize = 27.sp,
                fontFamily = FontFamily(Font(R.font.lesemibold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )
            Text(text = "Eclipse ",
                color = Color.White,
                fontSize = 27.sp,
                fontFamily = FontFamily(Font(R.font.lesemibold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-6.dp)
            )
            Divider(
                color = colorResource(id = R.color.blueAcc),
                modifier = Modifier.padding(top = 54.dp, end = 19.dp)
            )

        }

        Text(text= "Lunar eclipses occur at the full moon phase. When Earth is positioned precisely between the Moon and Sun, Earth’s shadow falls upon the surface of the Moon, dimming it and sometimes turning the lunar surface a striking red over the course of a few hours. Each lunar eclipse is visible from half of Earth.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp),
            textAlign = TextAlign.Left)

        Row {
            Text(text = "Total ",
                color = colorResource(id = R.color.white),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.lesemibold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )
            Text(text = "Lunar Eclipse ",
                color = colorResource(id = R.color.blueAcc),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.lesemibold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-2.dp)
            )
            Divider(
                color = colorResource(id = R.color.blueAcc),
                modifier = Modifier.padding(top = 47.dp, end = 19.dp)
            )

        }
        Image(painter = painterResource(id = R.drawable.totallunar), contentDescription ="",
            Modifier.size(370.dp,245.dp).offset(20.dp,22.dp) )

        Text(text= "During a lunar eclipse, the Moon moves into Earth's shadow, but some sunlight still reaches it through Earth's atmosphere. The blue and violet light scatters away, but the red and orange light makes it through, giving the Moon a reddish appearance. The more dust or clouds in the atmosphere, the redder the Moon will appear.\n" +
                "In short, the Moon appears red during a lunar eclipse because the blue and violet light is scattered away by Earth's atmosphere, leaving only the red and orange light to reach the Moon.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp).offset(0.dp,22.dp),
            textAlign = TextAlign.Left)
        Spacer(modifier = Modifier.padding(top = 22.dp))
        Row {
            Text(text = "Partial ",
                color = colorResource(id = R.color.blueAcc),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.lesemibold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )
            Text(text = "Lunar Eclipse ",
                color = colorResource(id = R.color.white),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.lesemibold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-2.dp)
            )
            Divider(
                color = colorResource(id = R.color.blueAcc),
                modifier = Modifier.padding(top = 47.dp, end = 19.dp)
            )

        }
        Text(text= "An imperfect alignment of Sun, Earth and Moon results in the Moon passing through only part of Earth's umbra. The shadow grows and then recedes without ever entirely covering the Moon.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp).offset(0.dp,-6.dp),
            textAlign = TextAlign.Left)
        Image(painter = painterResource(id = R.drawable.partialunar), contentDescription ="",
            Modifier.size(390.dp,215.dp).offset(11.dp,18.dp) )

        Spacer(modifier = Modifier.padding(top = 22.dp))

        Row {
            Text(text = "Penumbral ",
                color = colorResource(id = R.color.blueAcc),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.lesemibold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )
            Text(text = "Eclipse",
                color = colorResource(id = R.color.white),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.lesemibold)),
                modifier = Modifier
                    .padding(top = 31.dp)
                    .offset(-2.dp)
            )
            Divider(
                color = colorResource(id = R.color.blueAcc),
                modifier = Modifier.padding(top = 47.dp, end = 19.dp)
            )

        }
        Image(painter = painterResource(id = R.drawable.penu), contentDescription ="",
            Modifier.size(390.dp,233.dp).offset(11.dp,18.dp) )

        Text(text= "If you don’t know this one is happening, you might miss it. The Moon travels through Earth’s penumbra, or the faint outer part of its shadow. The Moon dims so slightly that it can be difficult to notice.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lelight)),
            modifier = Modifier.padding(top = 18.dp, start = 18.dp,end=18.dp).offset(0.dp,22.dp),
            textAlign = TextAlign.Left)

        Spacer(modifier = Modifier.padding(top = 72.dp))

    }





}



