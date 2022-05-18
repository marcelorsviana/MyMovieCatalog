package com.mrsv.mymoviecatalog.presenter

import com.mrsv.mymoviecatalog.models.ModelMovies
import com.mrsv.mymoviecatalog.repository.RetrofitConfig
import com.mrsv.mymoviecatalog.utils.Constants.Companion.API_KEY
import com.mrsv.mymoviecatalog.utils.Constants.Companion.LANGUAGE
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(val _view: IPresenter.ContratoView) : IPresenter.ContratoRequest {

    private val view: IPresenter.ContratoView = _view

    override fun requestApi() {

        val call: Call<ModelMovies?> = RetrofitConfig().getService.getApiMovies(API_KEY, LANGUAGE)

        call.enqueue(object : Callback<ModelMovies?> {
            override fun onResponse(call: Call<ModelMovies?>, response: Response<ModelMovies?>) {
                val receivedMovies: ModelMovies? = response.body()
                view.movieList(receivedMovies)
            }

            override fun onFailure(call: Call<ModelMovies?>, t: Throwable) {
                view.mostraErro(t.message.toString())
            }
        })
    }
}
