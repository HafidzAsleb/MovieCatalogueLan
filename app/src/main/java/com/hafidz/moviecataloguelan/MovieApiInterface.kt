package com.hafidz.moviecataloguehaf

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=bf475c55981115c0a8afa3d3620c621d")
    fun getMovieList(): Call<MovieResponse>
}

