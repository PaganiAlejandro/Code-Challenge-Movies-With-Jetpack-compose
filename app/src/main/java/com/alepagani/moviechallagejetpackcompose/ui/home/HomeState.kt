package com.alepagani.moviechallagejetpackcompose.ui.home

import com.alepagani.moviechallagejetpackcompose.data.model.MovieWithGenres

data class HomeState(
    val listMoviesLiked: List<MovieWithGenres> = emptyList(),
    val listMovies: List<MovieWithGenres> = emptyList()
)