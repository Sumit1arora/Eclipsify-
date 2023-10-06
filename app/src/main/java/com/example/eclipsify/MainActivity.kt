package com.example.eclipsify

import android.os.Bundle
import android.transition.Transition
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.EaseInBack
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgs
import com.example.eclipsify.mainScreens.eclipseGame
import com.example.eclipsify.mainScreens.eclipseGame2
import com.example.eclipsify.mainScreens.eclipseGame3
import com.example.eclipsify.mainScreens.eclipseGame4
import com.example.eclipsify.mainScreens.findEclipse
import com.example.eclipsify.mainScreens.kidScreen
import com.example.eclipsify.mainScreens.lunarEclipse
import com.example.eclipsify.mainScreens.solarEclipse
import com.example.eclipsify.mainScreens.whatEclipse
import com.example.eclipsify.mainScreens.youngScreen
import com.example.eclipsify.spalshandlogin.SplashScreen
import com.example.eclipsify.ui.theme.EclipsifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EclipsifyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
App()    }
            }
        }
    }
}

@Composable
fun App(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "YoungScreen",
        enterTransition = { EnterTransition.None}, exitTransition = { ExitTransition.None}){

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

    }
}
