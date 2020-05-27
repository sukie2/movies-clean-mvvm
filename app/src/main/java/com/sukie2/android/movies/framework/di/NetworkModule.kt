package com.sukie2.android.movies.framework.di

import com.sukie2.android.movies.framework.networking.EndPoint
import com.sukie2.android.movies.framework.networking.MovieAPI
import com.sukie2.android.movies.framework.networking.RequestInterceptor
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.logging.HttpLoggingInterceptor



val networkModule = module {
    val loggerInterceptor = HttpLoggingInterceptor()
    loggerInterceptor.apply { loggerInterceptor.level = HttpLoggingInterceptor.Level.BODY }
    single {
        OkHttpClient.Builder()
            .addInterceptor(loggerInterceptor)
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

