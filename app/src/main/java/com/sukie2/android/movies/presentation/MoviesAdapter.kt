package com.sukie2.android.movies.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sukie2.android.movies.R
import kotlinx.android.synthetic.main.movie_list_cell.view.*

class MoviesAdapter(private val myDataset: Array<String>) :
    RecyclerView.Adapter<MoviesAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_list_cell, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.view.textView.text = myDataset[position]
    }

    override fun getItemCount() = myDataset.size
}