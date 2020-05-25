package com.sukie2.android.movies.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sukie2.android.movies.framework.networking.APIResult
import com.sukie2.android.movies.usecases.MovieUseCase
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent


class MoviesViewModel(val movieUseCase: MovieUseCase): ViewModel(), KoinComponent{

    fun fetchPopularMovies(){
        viewModelScope.launch {
            movieUseCase.fetchPopularMovies {
                when(it){
                    is APIResult.Success ->{

                    }
                    is APIResult.Failure ->{

                    }
                }
            }
        }
    }
}

