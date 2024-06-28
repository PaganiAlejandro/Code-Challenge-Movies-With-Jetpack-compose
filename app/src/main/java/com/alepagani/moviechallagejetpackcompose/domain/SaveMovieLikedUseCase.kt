package com.alepagani.moviechallagejetpackcompose.domain

import com.alepagani.moviechallagejetpackcompose.data.model.Movie
import javax.inject.Inject

class SaveMovieLikedUseCase @Inject constructor(private val repository: Repository){

    operator suspend fun invoke(movie: Movie) = repository.saveMovieLiked(movie)
}