package com.sukie2.android.movies.framework.di

import com.sukie2.android.movies.data.MoviesRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { MoviesRepository(get()) }
}