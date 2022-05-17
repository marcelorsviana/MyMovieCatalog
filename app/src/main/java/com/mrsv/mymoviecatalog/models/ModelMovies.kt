package com.mrsv.mymoviecatalog.models

import com.google.gson.annotations.SerializedName

data class ModelMovies(
    @SerializedName("results")
    val results: List<ModelResultMovies>
)
