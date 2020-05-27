package com.sukie2.android.movies.data

import com.sukie2.android.movies.domain.MovieResponse
import com.sukie2.android.movies.framework.networking.APIResult
import com.sukie2.android.movies.framework.networking.MovieAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesRepository (val movieAPI: MovieAPI){

    fun fetchPopularMovies(onResult: (APIResult<Any?>) -> Unit) {
        this.movieAPI.fetchPopularMovies(page = 1).enqueue(object : Callback<MovieResponse> {

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                onResult(APIResult.Failure(t.toString()))
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                onResult(APIResult.Success(response.body()))
            }
        })
    }
}