package com.sukie2.android.movies.framework.networking

import com.sukie2.android.movies.domain.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieAPI {

    @GET("/3/movie/popular?language=en-US")
    fun fetchPopularMovies(@Query("page") page: Int): Call<MovieResponse>
}