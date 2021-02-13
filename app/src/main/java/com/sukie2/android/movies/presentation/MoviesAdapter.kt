package com.sukie2.android.movies.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sukie2.android.movies.R
import com.sukie2.android.movies.domain.Movie
import com.sukie2.android.movies.framework.networking.EndPoint.BASE_POSTER_PATH

class MoviesAdapter(private val movies: List<Movie>) :
    RecyclerView.Adapter<MoviesAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_list_cell, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.view.textView.text = movies[position].original_title
        Glide.with(holder.view.context).load(getPosterPath( movies[position].poster_path)).into(holder.view.imageView);
    }

    override fun getItemCount() = movies.size

    /** gets the poster's path. */
    fun getPosterPath(posterPath: String) = BASE_POSTER_PATH + posterPath
}