package com.example.myapplication.webservice


import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/api/register")
    fun loginApi(@Body loginRequest: LoginRequest): Call<LoginResponse>
}