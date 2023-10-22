package com.example.eclipsify.mainScreens


import android.content.Context
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.BufferedReader


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun upcomingEclipse(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(id = R.drawable.gp),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.up),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Row {
            Text(
                text = "Upcoming",
                color = colorResource(id = R.color.orange),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier.padding(start = 15.dp, top = 31.dp)
            )

            Text(
                text = "Eclipses",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 12.dp, top = 31.dp)
                    .offset(-6.dp)
            )
        }

        Spacer(modifier = Modifier.height(40.dp))



        Row {
            Text(
                text = "Eclipses",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier.padding(start = 15.dp, top = 31.dp)
            )

            Text(
                text = "in 2023",
                color = colorResource(id = R.color.orange),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 12.dp, top = 31.dp)
                    .offset(-6.dp)
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.up23),
            contentDescription = "",
            Modifier
                .size(351.dp, 160.dp)
                .offset(25.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))


        Row {
            Text(
                text = "Eclipses in",
                color = colorResource(id = R.color.orange),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier.padding(start = 15.dp, top = 31.dp)
            )

            Text(
                text = " 2024",
                color = colorResource(id = R.color.white),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 12.dp, top = 31.dp)
                    .offset(-6.dp)
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.up241),
            contentDescription = "",
            Modifier
                .size(351.dp, 160.dp)
                .offset(25.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.up242),
            contentDescription = "",
            Modifier
                .size(351.dp, 160.dp)
                .offset(25.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.up243),
            contentDescription = "",
            Modifier
                .size(351.dp, 160.dp)
                .offset(25.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.up244),
            contentDescription = "",
            Modifier
                .size(351.dp, 160.dp)
                .offset(25.dp)
        )


    }
}


