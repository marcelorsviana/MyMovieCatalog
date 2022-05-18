package com.mrsv.mymoviecatalog.presenter

import com.mrsv.mymoviecatalog.models.ModelMovies

interface IPresenter {

    // Faz a ligação interna (no app) do PRESENTER com o Retrofit, preparando tudo para ser enviado para o servidor.
    interface ContratoRequest {
        fun requestApi()
    }

    // Faz ligação do PRESENTER com a VIEW, que é a MainActivity
    interface ContratoView {
        fun mostraErro(erro: String)

        fun movieList(listaDeFilmes: ModelMovies?)
    }
}
