package com.mrsv.mymoviecatalog.repository

import com.mrsv.mymoviecatalog.interfaces.IServices
import com.mrsv.mymoviecatalog.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfig {

    private val retrofit by lazy {

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val getService: IServices by lazy {
        retrofit.create(IServices::class.java)
    }
}
