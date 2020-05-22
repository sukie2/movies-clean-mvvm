package com.sukie2.android.movies.framework

import android.app.Application
import com.sukie2.android.movies.di.networkModule
import com.sukie2.android.movies.di.repositoryModule
import com.sukie2.android.movies.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MoviesApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MoviesApplication)
            // declare modules
            modules(networkModule, repositoryModule, viewModelModule)
        }
    }
}
