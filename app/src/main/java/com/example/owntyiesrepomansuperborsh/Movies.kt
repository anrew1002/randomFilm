package com.example.owntyiesrepomansuperborsh

data class Movies (val movies: MutableList<Movie>) {

    val size: Int
        get() =  movies.size

}