package com.sukie2.android.movies.presentation

import androidx.lifecycle.*
import com.sukie2.android.movies.domain.Movie
import com.sukie2.android.movies.domain.MovieResponse
import com.sukie2.android.movies.framework.networking.APIResult
import com.sukie2.android.movies.usecases.MovieUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import timber.log.Timber


class MoviesViewModel(val movieUseCase: MovieUseCase) : ViewModel(), KoinComponent {

    init {
        Timber.d("MoviesViewModel injection")
    }

    val moviesLiveData: MutableLiveData<List<Movie>> by lazy {
        MutableLiveData<List<Movie>>()
    }

    val errorLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun fetchPopularMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            movieUseCase.fetchPopularMovies {
                when (it) {
                    is APIResult.Success -> {
                        moviesLiveData.value = (it.responseData as MovieResponse).results
                    }
                    is APIResult.Failure -> {
                        errorLiveData.value = it.toString()
                    }
                }
            }
        }
    }
}

