package com.example.myapplication.webservice.network


import com.example.myapplication.webservice.Model.LoginRequest
import com.example.myapplication.webservice.Model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/api/register")
    fun loginApi(@Body loginRequest: LoginRequest): Call<LoginResponse>
}