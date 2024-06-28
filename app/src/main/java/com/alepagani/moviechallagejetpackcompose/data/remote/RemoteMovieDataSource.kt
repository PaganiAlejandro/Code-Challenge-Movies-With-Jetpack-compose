package com.alepagani.moviechallagejetpackcompose.data.remote

import com.alepagani.moviechallagejetpackcompose.data.model.GenreList
import com.alepagani.moviechallagejetpackcompose.data.model.MovieResponse
import com.alepagani.moviechallagejetpackcompose.data.remote.MovieApi
import javax.inject.Inject

class RemoteMovieDataSource @Inject constructor(private val movieApi: MovieApi) {

    suspend fun getMovieList(page: Int): MovieResponse = movieApi.getNowPlayingMovies("es", page)

    suspend fun getGenreList(): GenreList = movieApi.getGenres()
}