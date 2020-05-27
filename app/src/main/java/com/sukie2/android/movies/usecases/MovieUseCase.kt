package com.sukie2.android.movies.usecases

import com.sukie2.android.movies.data.MoviesRepository
import com.sukie2.android.movies.framework.networking.APIResult

class MovieUseCase(private val moviesRepository: MoviesRepository) {

    fun fetchPopularMovies(onResult: (APIResult<Any?>) -> Unit) {
       this.moviesRepository.fetchPopularMovies{ response ->
           onResult(response)
       }
    }
}