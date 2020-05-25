package com.sukie2.android.movies.framework.networking

sealed class APIResult<out T : Any?> {
    data class Success<T>(val responseData: T) : APIResult<T>()
    data class Failure<T>(val exception: T) : APIResult<T>()
}