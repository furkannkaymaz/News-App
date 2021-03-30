package com.example.rocketapp.managers


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url


interface ServiceEndpoints {
     @GET("anasayfa.json")
    fun news(): Call<String>

    @GET("detay.json")
    fun newsDetail(): Call<String>

}