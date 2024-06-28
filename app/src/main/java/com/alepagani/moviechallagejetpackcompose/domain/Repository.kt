package com.alepagani.moviechallagejetpackcompose.domain

import com.alepagani.moviechallagejetpackcompose.data.model.Movie
import com.alepagani.moviechallagejetpackcompose.data.model.MovieWithGenres
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getNowPlayingMoviesWithGenres(): Flow<List<MovieWithGenres>>

    fun getMoviesLiked(): Flow<List<Movie>>

    suspend fun saveMovieLiked(movie: Movie)
}