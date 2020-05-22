package com.sukie2.android.movies.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sukie2.android.movies.R

class MoviesActivity : AppCompatActivity(R.layout.activity_movies) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment = MoviesFragment()
        fragmentTransaction.add(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
