package com.example.eclipsify.mainScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.eclipsify.R

@Preview
@Composable
fun comic() {
    Box(modifier =Modifier.fillMaxSize().background(color = Color.White))
    {
        Image(painter = painterResource(id = R.drawable.comicis ), contentDescription = "",
            Modifier
                .fillMaxSize()
                .verticalScroll(state = rememberScrollState()) , contentScale = ContentScale.FillBounds)
    }

}