package com.example.myapplication.webservice.network


import com.example.myapplication.webservice.network.Model.LoginRequest
import com.example.myapplication.webservice.network.Model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/api/register")
    fun loginApi(@Body loginRequest: LoginRequest): Call<LoginResponse>
}