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
fun jupiterEclipse(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black))
    {
        Image(painter = painterResource(id = R.drawable.gp), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())) {

        Image(
            painter = painterResource(id = R.drawable.jupi1),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="", modifier = Modifier.offset(15.dp,-250.dp).clickable { navController.navigate("YoungScreen") }, tint = Color.White)


        Row {
            Text(
                text = "Eclipse on ",
                color = colorResource(id = R.color.orange),
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )
            Text(
                text = "Jupiter",
                color = Color.White,
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(top = 32.dp)
                    .offset(-4.dp)
            )
            Divider(
                color = colorResource(id = R.color.orange),
                modifier = Modifier.padding(top = 54.dp, end = 19.dp)
            )

        }

        Text(
            text = "Only Jupiter's four Galilean moons are large enough to completely block the Sun during a solar eclipse. Io, the closest moon to Jupiter, would create the largest shadow, followed by Europa and Ganymede, which have about the same apparent diameter. Callisto, the farthest out moon, would create the smallest shadow.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier.padding(top = 18.dp, start = 21.dp, end = 21.dp),
            textAlign = TextAlign.Justify
        )


        Image(
            painter = painterResource(id = R.drawable.jupi2), contentDescription = "",
            Modifier
                .size(390.dp, 215.dp)
                .offset(11.dp, 22.dp)
        )

        Text(
            text = "Jupiter's moon Io casts a shadow on the planet in this image taken by the Juno spacecraft. Eclipses are common on Jupiter, but viewing them is currently impossible.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier
                .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                .offset(0.dp, 22.dp),
            textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.padding(top = 22.dp))


        Image(
            painter = painterResource(id = R.drawable.jupi3), contentDescription = "",
            Modifier
                .size(390.dp, 215.dp)
                .offset(11.dp, 18.dp)
        )
        Spacer(modifier = Modifier.padding(top = 22.dp))

        /*Text(
            text = "Each time these eclipses are observed, they allow scientists to measure subtle shifts in Phobos’ orbit over time. The moon’s tidal forces pull on the deep interior of the Red Planet, as well as its crust and mantle; studying how much Phobos shifts over time reveals something about how resistant the crust and mantle are, and thus what kinds of materials they’re made of.",
            color = Color.White, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.popreg)),
            modifier = Modifier
                .padding(top = 18.dp, start = 21.dp, end = 21.dp)
                .offset(0.dp, -6.dp),
            textAlign = TextAlign.Justify
        )*/


    }



}


