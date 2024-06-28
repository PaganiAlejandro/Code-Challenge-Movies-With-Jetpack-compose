package com.alepagani.moviechallagejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alepagani.moviechallagejetpackcompose.navigation.NavigationHome
import com.alepagani.moviechallagejetpackcompose.navigation.NavigationRoute
import com.alepagani.moviechallagejetpackcompose.ui.home.HomeScreen
import com.alepagani.moviechallagejetpackcompose.ui.theme.MovieChallageJetpackComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieChallageJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    NavigationHome(navHostController = navController, startDDstination = NavigationRoute.Home)
                }
            }
        }
    }
}

