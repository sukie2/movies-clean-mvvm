package com.sukie2.android.movies.presentation

import android.os.Bundle
import com.sukie2.android.movies.R

class MoviesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment = MoviesFragment()
        fragmentTransaction.add(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
