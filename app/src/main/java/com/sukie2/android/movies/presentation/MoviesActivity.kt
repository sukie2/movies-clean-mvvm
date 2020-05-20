package com.sukie2.android.movies.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.sukie2.android.movies.R
import kotlinx.android.synthetic.main.activity_main.*

class MoviesActivity : AppCompatActivity() {

    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: Array<String> = arrayOf("a", "bb", "xx", "ll", "pp", "pp", "pp", "pp", "pp", "pp", "pp", "pp", "pp", "pp")
        viewAdapter = MoviesAdapter(list)
        rvNames.adapter = viewAdapter
        viewAdapter.notifyDataSetChanged()

    }
}
