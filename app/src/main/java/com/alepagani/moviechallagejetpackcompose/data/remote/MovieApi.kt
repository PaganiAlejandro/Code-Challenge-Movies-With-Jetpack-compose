package com.alepagani.moviechallagejetpackcompose.data.remote

import com.alepagani.moviechallagejetpackcompose.BuildConfig
import com.alepagani.moviechallagejetpackcompose.data.model.GenreList
import com.alepagani.moviechallagejetpackcompose.data.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MovieApi {

    @Headers("Authorization: ${BuildConfig.API_KEY}", "accept: application/json")
    @GET("movie/top_rated")
    suspend fun getNowPlayingMovies(
        @Query("language") language: String = "es",
        @Query("page") page: Int
    ): MovieResponse

    @Headers("Authorization: ${BuildConfig.API_KEY}",
        "accept: application/json")
    @GET("genre/movie/list")
    suspend fun getGenres(@Query("language") language: String = "en"): GenreList
}