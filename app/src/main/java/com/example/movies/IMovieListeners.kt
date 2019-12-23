package com.example.movies

import android.view.View

interface IMovieListeners {
    fun onMovieItemClick(movieItem: MovieItem)
}