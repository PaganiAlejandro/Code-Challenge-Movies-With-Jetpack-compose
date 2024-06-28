package com.alepagani.moviechallagejetpackcompose.domain

import com.alepagani.moviechallagejetpackcompose.domain.Repository
import javax.inject.Inject

class GetMovieLikedUseCase @Inject constructor(private val repository: Repository) {

    operator fun invoke() = repository.getMoviesLiked()
}