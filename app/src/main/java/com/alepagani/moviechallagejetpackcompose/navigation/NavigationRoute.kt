package com.alepagani.moviechallagejetpackcompose.navigation

sealed class NavigationRoute(val route: String) {
    object Home: NavigationRoute("Home")

    object Detail: NavigationRoute("Detail")

    object Search: NavigationRoute("Search")
}