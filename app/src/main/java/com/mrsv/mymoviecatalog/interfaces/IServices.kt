package com.mrsv.mymoviecatalog.interfaces

import com.mrsv.mymoviecatalog.models.ModelMovies
import retrofit2.Call
import retrofit2.http.GET

interface IServices {
    @GET("3/trending/movie/week?")
    fun getApiMovies: Call<ModelMovies>
}