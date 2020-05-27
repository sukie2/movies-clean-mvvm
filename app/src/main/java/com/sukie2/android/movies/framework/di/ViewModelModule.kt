package com.sukie2.android.movies.framework.di

import com.sukie2.android.movies.presentation.MoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
    viewModel { MoviesViewModel(get()) }
}
