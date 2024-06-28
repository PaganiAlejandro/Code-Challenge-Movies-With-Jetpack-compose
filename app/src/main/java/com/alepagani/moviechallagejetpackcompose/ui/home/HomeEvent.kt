package com.alepagani.moviechallagejetpackcompose.ui.home

import com.alepagani.moviechallagejetpackcompose.data.model.MovieWithGenres

sealed interface HomeEvent {
    data class selectMovie(val movie: MovieWithGenres): HomeEvent

}