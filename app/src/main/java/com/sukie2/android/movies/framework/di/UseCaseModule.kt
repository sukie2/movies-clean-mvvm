package com.sukie2.android.movies.framework.di

import com.sukie2.android.movies.data.MoviesRepository
import com.sukie2.android.movies.usecases.MovieUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { MovieUseCase(get()) }
}