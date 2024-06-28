package com.alepagani.moviechallagejetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alepagani.moviechallagejetpackcompose.ui.detail.DetailScreen
import com.alepagani.moviechallagejetpackcompose.ui.home.HomeScreen
import com.alepagani.moviechallagejetpackcompose.ui.search.SearchScreen

@Composable
fun NavigationHome(
    navHostController: NavHostController,
    startDDstination: NavigationRoute
) {
    NavHost(navController = navHostController, startDestination = startDDstination.route) {
        composable(NavigationRoute.Home.route) {
            HomeScreen(
                onSearch = {
                    navHostController.navigate(NavigationRoute.Search.route)
                }
            )
        }
        composable(NavigationRoute.Detail.route) {
            DetailScreen()
        }
        composable(NavigationRoute.Search.route){
            SearchScreen()
        }
    }
}