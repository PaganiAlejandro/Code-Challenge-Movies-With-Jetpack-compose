package com.alepagani.moviechallagejetpackcompose.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alepagani.codechallengemovies.data.local.entity.MovieGenreCrossRef
import com.alepagani.moviechallagejetpackcompose.data.local.entity.GenreEntity
import com.alepagani.moviechallagejetpackcompose.data.local.entity.MovieEntity


@Database(entities = [MovieEntity::class, GenreEntity::class, MovieGenreCrossRef::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun movieDao(): MovieDao
}