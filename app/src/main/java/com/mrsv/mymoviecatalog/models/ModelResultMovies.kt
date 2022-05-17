package com.mrsv.mymoviecatalog.models

data class ModelResultMovies(
val poster_path : String,
val vote_average: Double,
val title : String,
val overview : String,
val release_date : String,
val id: Int,
val backdrop_path : String,
val media_type : String
)