package com.mrsv.mymoviecatalog.repository

import com.mrsv.mymoviecatalog.models.ModelMovies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IServices {
    @GET("3/trending/movie/week?")
    fun getApiMovies(
        @Query("api_key") apikey: String?,
        @Query("language") language: String?
    ): Call<ModelMovies?>
}

// https://api.themoviedb.org/3/trending/movie/week?api_key=2c0b360bf4312ce2f39defb8e18a81e0&language=pt-BR
