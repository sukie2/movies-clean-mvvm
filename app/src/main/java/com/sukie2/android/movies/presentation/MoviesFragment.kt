package com.sukie2.android.movies.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.sukie2.android.movies.R
import com.sukie2.android.movies.domain.Movie
import kotlinx.android.synthetic.main.fragment_movies.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class MoviesFragment : Fragment(R.layout.fragment_movies) {
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private val viewModel: MoviesViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.fetchPopularMovies()

        val moviesOserver =  Observer<List<Movie>> {
            viewAdapter = MoviesAdapter(it)
            rvNames.adapter = viewAdapter
            viewAdapter.notifyDataSetChanged()
        }

        viewModel.moviesLiveData.observe(viewLifecycleOwner, moviesOserver)

    }
}

