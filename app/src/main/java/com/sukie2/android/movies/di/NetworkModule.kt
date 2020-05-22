package com.sukie2.android.movies.di

import com.sukie2.android.movies.framework.networking.EndPoint
import com.sukie2.android.movies.framework.networking.MovieAPI
import com.sukie2.android.movies.framework.networking.RequestInterceptor
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        OkHttpClient.Builder()
            .addInterceptor(RequestInterceptor())
            .build()
    }

    single {
        Retrofit.Builder()
            .client(get<OkHttpClient>())
            .baseUrl(EndPoint.TheMovieDB)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single { get<Retrofit>().create(MovieAPI::class.java) }
}

