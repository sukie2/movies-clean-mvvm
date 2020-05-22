package com.sukie2.android.movies.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.sukie2.android.movies.R
import kotlinx.android.synthetic.main.fragment_movies.*

class MoviesFragment : Fragment(R.layout.fragment_movies) {
    private lateinit var viewAdapter: RecyclerView.Adapter<*>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list: Array<String> = arrayOf(
            "a",
            "bb",
            "xx",
            "ll",
            "pp",
            "pp",
            "pp",
            "pp"
        )
        viewAdapter = MoviesAdapter(list)
        rvNames.adapter = viewAdapter
        viewAdapter.notifyDataSetChanged()
    }
}

