package com.example.myapplication.webservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitActivity : AppCompatActivity() {
    private lateinit var retroFit: Retrofit
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retro_fit)
        callLoginApi()
    }

    private fun callLoginApi() {
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