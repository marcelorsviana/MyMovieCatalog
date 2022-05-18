package com.mrsv.mymoviecatalog.view

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mrsv.mymoviecatalog.R
import com.mrsv.mymoviecatalog.databinding.ListViewBinding
import com.mrsv.mymoviecatalog.models.ModelMovies
import com.mrsv.mymoviecatalog.models.mockMovies
import com.mrsv.mymoviecatalog.presenter.IPresenter
import com.mrsv.mymoviecatalog.presenter.Presenter
import com.mrsv.mymoviecatalog.view.adapter.MovieListAdapter

class MainActivity : AppCompatActivity(), IPresenter.ContratoView {

    val view: IPresenter.ContratoRequest = Presenter(this)

    private val binding by lazy { ListViewBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val movieListAdapter = MovieListAdapter()
        binding.movieListRecyclerView.adapter = movieListAdapter

        movieListAdapter.submitList(mockMovies())

        acessandoAPi()
    }

    fun acessandoAPi() {
        view.requestApi()
    }

    override fun movieList(listaDeFilmes: ModelMovies?) {
        Log.i("TAG", "viewApi: $listaDeFilmes")
    }

    override fun mostraErro(erro: String) {
        Toast.makeText(this, "Ocorreu um erro ao consultar a API: $erro", Toast.LENGTH_SHORT)
            .show()
    }
}
