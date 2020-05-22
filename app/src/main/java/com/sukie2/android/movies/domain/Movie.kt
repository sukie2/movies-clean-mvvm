package com.sukie2.android.movies.domain

data class MovieResponse (
    val page : Int,
    val total_results : Int,
    val total_pages : Int,
    val results : List<MovieResults>
)

data class MovieResults (
    val popularity : Double,
    val vote_count : Int,
    val video : Boolean,
    val poster_path : String,
    val id : Int,
    val adult : Boolean,
    val backdrop_path : String,
    val original_language : String,
    val original_title : String,
    val genre_ids : List<Int>,
    val title : String,
    val vote_average : Int,
    val overview : String,
    val release_date : String
)