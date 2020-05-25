package com.sukie2.android.movies.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.sukie2.android.movies.R
import kotlinx.android.synthetic.main.fragment_movies.*
import org.koin.android.ext.android.inject

class MoviesFragment : Fragment(R.layout.fragment_movies) {
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private val viewModel: MoviesViewModel by inject()

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

