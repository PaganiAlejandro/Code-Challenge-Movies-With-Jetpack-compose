package com.alepagani.moviechallagejetpackcompose.data.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.alepagani.codechallengemovies.data.local.entity.MovieGenreCrossRef
import com.alepagani.moviechallagejetpackcompose.data.local.entity.GenreEntity
import com.alepagani.moviechallagejetpackcompose.data.local.entity.MovieEntity

data class MovieWithGenres(
    @Embedded val movie: MovieEntity,
    @Relation(
        parentColumn = "movieId",
        entity = GenreEntity::class,
        entityColumn = "genreId",
        associateBy = Junction(
            value = MovieGenreCrossRef::class,
            parentColumn = "movieId",
            entityColumn = "genreId"
        )
    )
    val genres: List<GenreEntity>
)