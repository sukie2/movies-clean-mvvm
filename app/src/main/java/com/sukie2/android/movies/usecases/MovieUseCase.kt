package com.sukie2.android.movies.usecases

import com.sukie2.android.movies.data.MoviesRepository
import com.sukie2.android.movies.domain.MovieResponse
import com.sukie2.android.movies.framework.networking.APIResult
import java.io.IOException

class MovieUseCase(private val moviesRepository: MoviesRepository) {

    suspend fun fetchPopularMovies(onResult: (APIResult<Any?>) -> Unit) {
       this.moviesRepository.fetchPopularMovies{ response ->
           onResult(response)
       }
    }
}