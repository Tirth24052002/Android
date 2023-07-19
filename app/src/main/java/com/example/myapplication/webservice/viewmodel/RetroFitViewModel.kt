package com.example.myapplication.webservice.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.myapplication.webservice.Model.LoginRequest
import com.example.myapplication.webservice.Model.LoginResponse
import com.example.myapplication.webservice.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitViewModel: ViewModel() {

    init {
        Log.d("TAG", ": view model called ")
    }
     lateinit var retroFit: Retrofit
     fun callLoginApi() {
        val apiInterface = getRetroFitObjet().create(ApiInterface::class.java)
        val loginRequest = LoginRequest()
        loginRequest.email = "eve.holt@reqres.in"
        loginRequest.password = "pistol"
        val loginApi = apiInterface.loginApi(loginRequest)
        loginApi.enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                val body = response.body()
                body?.myToken?.let { Log.d("My token is", it) }
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

            }

        })
    }

    private fun getRetroFitObjet(): Retrofit {
        retroFit = Retrofit.Builder().baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create()).build()
        return retroFit
    }

}