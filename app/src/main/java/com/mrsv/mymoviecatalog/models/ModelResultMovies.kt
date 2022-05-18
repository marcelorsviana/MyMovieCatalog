package com.mrsv.mymoviecatalog.models

data class ModelResultMovies(
    val poster_path: String,
    val vote_average: Double,
    val title: String,
    val overview: String,
    val release_date: String,
    val id: Int,
    val backdrop_path: String,
)

fun mockMovies() = listOf(
    ModelResultMovies(
        id = 453395,
        poster_path = "/hq2igFqb31fDqGotz8ZuUfwKgn8.jpg",
        vote_average = 7.5,
        title = "Doutor Estranho no Multiverso da Loucura",
        overview =
        "Doutor Estranho, com a ajuda de aliados místicos antigos e novos, atravessa as perigosas realidades alternativas e alucinantes do Multiverso para enfrentar um novo adversário misterioso.",
        release_date = "2022-05-04",
        backdrop_path = "/AdyJH8kDm8xT8IKTlgpEC15ny4u.jpg",
    ),
    ModelResultMovies(
        id = 453395,
        poster_path = "/hq2igFqb31fDqGotz8ZuUfwKgn8.jpg",
        vote_average = 7.5,
        title = "Doutor Estranho no Multiverso da Loucura",
        overview =
        "Doutor Estranho, com a ajuda de aliados místicos antigos e novos, atravessa as perigosas realidades alternativas e alucinantes do Multiverso para enfrentar um novo adversário misterioso.",
        release_date = "2022-05-04",
        backdrop_path = "/AdyJH8kDm8xT8IKTlgpEC15ny4u.jpg",
    ),
    ModelResultMovies(
        id = 453395,
        poster_path = "/hq2igFqb31fDqGotz8ZuUfwKgn8.jpg",
        vote_average = 7.5,
        title = "Doutor Estranho no Multiverso da Loucura",
        overview =
        "Doutor Estranho, com a ajuda de aliados místicos antigos e novos, atravessa as perigosas realidades alternativas e alucinantes do Multiverso para enfrentar um novo adversário misterioso.",
        release_date = "2022-05-04",
        backdrop_path = "/AdyJH8kDm8xT8IKTlgpEC15ny4u.jpg",
    ),
    ModelResultMovies(
        id = 453395,
        poster_path = "/hq2igFqb31fDqGotz8ZuUfwKgn8.jpg",
        vote_average = 7.5,
        title = "Doutor Estranho no Multiverso da Loucura",
        overview =
        "Doutor Estranho, com a ajuda de aliados místicos antigos e novos, atravessa as perigosas realidades alternativas e alucinantes do Multiverso para enfrentar um novo adversário misterioso.",
        release_date = "2022-05-04",
        backdrop_path = "/AdyJH8kDm8xT8IKTlgpEC15ny4u.jpg",
    ),
    ModelResultMovies(
        id = 453395,
        poster_path = "/hq2igFqb31fDqGotz8ZuUfwKgn8.jpg",
        vote_average = 7.5,
        title = "Doutor Estranho no Multiverso da Loucura",
        overview =
        "Doutor Estranho, com a ajuda de aliados místicos antigos e novos, atravessa as perigosas realidades alternativas e alucinantes do Multiverso para enfrentar um novo adversário misterioso.",
        release_date = "2022-05-04",
        backdrop_path = "/AdyJH8kDm8xT8IKTlgpEC15ny4u.jpg",
    )
)
