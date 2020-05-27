package com.sukie2.android.movies.presentation

import androidx.lifecycle.*
import com.sukie2.android.movies.domain.Movie
import com.sukie2.android.movies.domain.MovieResponse
import com.sukie2.android.movies.framework.networking.APIResult
import com.sukie2.android.movies.usecases.MovieUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent


class MoviesViewModel(val movieUseCase: MovieUseCase) : ViewModel(), KoinComponent {

    private var _movieLiveData: LiveData<List<Movie>> = MutableLiveData()
    val movieLiveData: LiveData<List<Movie>>
        get() = _movieLiveData

    val movies: MutableLiveData<List<Movie>> by lazy {
        MutableLiveData<List<Movie>>()
    }

    fun fetchPopularMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            movieUseCase.fetchPopularMovies {
                when (it) {
                    is APIResult.Success -> {
                        movies.value = (it.responseData as MovieResponse).results
                    }
                    is APIResult.Failure -> {

                    }
                }
            }
        }
    }
}

