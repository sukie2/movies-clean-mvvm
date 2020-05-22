package com.sukie2.android.movies.usecases

import com.sukie2.android.movies.domain.MovieResponse
import com.sukie2.android.movies.framework.networking.MovieAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieUseCase(private val movieApi: MovieAPI) {
    fun fetchPopularMovies(cbOnSuccess: (MovieResponse?) -> Unit, cbFailure: (Throwable?) -> Unit) {
        this.movieApi.fetchPopularMovies(page = 1).enqueue(object : Callback<MovieResponse> {

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                cbFailure(t)
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                cbOnSuccess(response.body())
            }
        })
    }
}