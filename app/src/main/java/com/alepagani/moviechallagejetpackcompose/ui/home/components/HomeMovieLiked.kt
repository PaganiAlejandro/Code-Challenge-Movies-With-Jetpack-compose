package com.alepagani.moviechallagejetpackcompose.ui.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.alepagani.moviechallagejetpackcompose.data.model.MovieWithGenres

@Composable
fun HomeMovieLiked(
    onSelectMovieClick: () -> Unit,
    movieWithGenres: MovieWithGenres
) {
    Box(modifier = Modifier.width(100.dp).height(150.dp)
        .clip(RoundedCornerShape(12.dp))
        .clickable {
            onSelectMovieClick()
        }.padding(5.dp)
    ){
        AsyncImage(model = "https://image.tmdb.org/t/p/w500/${movieWithGenres.movie.poster_path}",
            contentDescription = null)
    }
}