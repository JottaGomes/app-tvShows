package com.example.bretalseries

data class TVShow(
    val name: String,
    val popularaty: Double,
    val origin_country: Array <String>,
    val first_air_date: String,
    val id: Int,
    val vote_avarege: Double,
    val overview: String,
    val poster_path: String
)