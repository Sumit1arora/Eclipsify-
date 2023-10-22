package com.example.eclipsify

import ArImplementt
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eclipsify.Quiz.QuizApp
import com.example.eclipsify.Quiz.QuizPage
import com.example.eclipsify.Quiz.kidQuizApp
import com.example.eclipsify.Quiz.quizMain
import com.example.eclipsify.eclipseGame.comic
import com.example.eclipsify.eclipseGame.eclipseGame
import com.example.eclipsify.eclipseGame.eclipseGame2
import com.example.eclipsify.eclipseGame.eclipseGame3
import com.example.eclipsify.mainScreens.eclipseGame4
import com.example.eclipsify.eclipseGame.findEclipse
import com.example.eclipsify.mainScreens.Choice
import com.example.eclipsify.mainScreens.Myth
import com.example.eclipsify.mainScreens.commm
import com.example.eclipsify.mainScreens.commm2
import com.example.eclipsify.mainScreens.commm3
import com.example.eclipsify.mainScreens.commm4
import com.example.eclipsify.mainScreens.commm5
import com.example.eclipsify.mainScreens.jupiterEclipse
import com.example.eclipsify.mainScreens.kidScreen
import com.example.eclipsify.mainScreens.kidsupcomingEclipse
import com.example.eclipsify.mainScreens.lunarEclipse
import com.example.eclipsify.mainScreens.lunarkidEclipse
import com.example.eclipsify.mainScreens.marsEclipse
import com.example.eclipsify.mainScreens.optionQuiz
import com.example.eclipsify.mainScreens.precautions
import com.example.eclipsify.mainScreens.solarEclipse
import com.example.eclipsify.mainScreens.solarkidEclipse
import com.example.eclipsify.mainScreens.upcomingEclipse
import com.example.eclipsify.mainScreens.whatEclipse
import com.example.eclipsify.mainScreens.whatEclipseKid
import com.example.eclipsify.mainScreens.youngScreen
import com.example.eclipsify.spalshandlogin.onboard
import com.example.eclipsify.ui.theme.EclipsifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
EclipsifyTheme {
    App()
}            }
        }
    }


@Composable
fun App(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Onboard",
        enterTransition = { EnterTransition.None}, exitTransition = { ExitTransition.None}){
        composable("Onboard"){
            onboard(navController = navController)
        }
        composable("Choice"){
            Choice(navController = navController)
        }
        composable("YoungScreen"){
            youngScreen(navController)


        }
        composable("KidScreen", enterTransition = { fadeIn(animationSpec = tween(300, easing = LinearEasing)) },){

            kidScreen(navController = navController)

        }
        composable("EclipseScreen"){
            whatEclipse(navController = navController)
        }
        composable("SolarEclipse")
        {
            solarEclipse(navController = navController)
        }
        composable("FindEclipse"){
            findEclipse(navController = navController)
        }
        composable("EclipseGame"){
            eclipseGame(navController = navController)
        }
        composable("EclipseGame2"){
            eclipseGame2(navController = navController)
        }
        composable("EclipseGame3"){
            eclipseGame3(navController = navController)
        }
        composable("EclipseGame4"){
            eclipseGame4(navController = navController)
        }
        composable("LunarEclipse"){
            lunarEclipse(navController = navController)
        }
        composable("Comic"){
            comic(navController = navController)
        }
        composable("SafetyPrecautions"){
            precautions(navController = navController)

        }
        composable("Myth"){
            Myth(navController = navController)
        }
composable("KidSolar"){
    solarkidEclipse(navController = navController)
}
        composable("KidLunar"){
            lunarkidEclipse(navController = navController)
        }
        composable("Upcoming"){
                

            upcomingEclipse(navController = navController)
        }
        composable("WhatQuiz"){
            optionQuiz(navController = navController)
        }
        composable("SolarQuiz"){
            QuizApp(navController = navController)
        }
        composable("LunarQuiz"){
            QuizPage(navController = navController)
        }
        composable("KidsUpcoming"){
            kidsupcomingEclipse(navController = navController)
        }
        composable("Mars"){
            marsEclipse(navController = navController)
        }
        composable("Jupiter"){
            jupiterEclipse(navController = navController)
        }
        composable("Comic1"){
            commm(navController = navController)
        }
        composable("Comic2"){
            commm2(navController = navController)
        }
        composable("AR"){
            ArImplementt( navController =navController )
        }
        composable("KidEclipse"){
            whatEclipseKid(navController)
        }
        composable("Comic3"){
            commm3(navController = navController)
        }
        composable("Comic4"){
            commm4(navController = navController)
        }
        composable("Comic5") {
            commm5(navController = navController)
        }
        composable("KidQuiz"){
            kidQuizApp(navController = navController)
        }
        composable("QuizKid"){
            quizMain(navController = navController)
        }


    }
}
