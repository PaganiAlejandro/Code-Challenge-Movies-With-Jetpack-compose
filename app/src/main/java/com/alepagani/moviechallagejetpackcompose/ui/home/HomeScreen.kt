package com.alepagani.moviechallagejetpackcompose.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.alepagani.moviechallagejetpackcompose.R
import com.alepagani.moviechallagejetpackcompose.ui.home.components.HomeMovieCard
import com.alepagani.moviechallagejetpackcompose.ui.home.components.HomeMovieLiked

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onSearch: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state = viewModel.state

    Scaffold(modifier = Modifier.fillMaxWidth(), topBar =  {
        CenterAlignedTopAppBar(
            title = { 
                Text(text = "Tv Show Reminder") 
                    }, 
            navigationIcon = {
                IconButton(onClick = onSearch) {
                    Icon(painter = painterResource(id = R.drawable.ic_search), modifier = Modifier.padding(5.dp), contentDescription = "Icon search movie")
                }
            })
    }) {
        Column(modifier = Modifier
            .padding(it)
            .padding(16.dp)) {
            Text("Estoy en al home")
        }
        LazyRow(){
            items(state.listMoviesLiked){
                HomeMovieLiked(
                    onSelectMovieClick = {},
                    movieWithGenres = it
                )
            }
        }
        LazyColumn() {
            items(state.listMovies) {
                HomeMovieCard(
                    onMovieSelectedClick = {},
                    movie = it
                )
            }
        }

    }
}

// @Preview
// @Composable
// fun previewHomeScreen() {
//     HomeScreen() {
//
//     }
// }
