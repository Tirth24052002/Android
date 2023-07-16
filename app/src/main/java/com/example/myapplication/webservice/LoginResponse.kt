package com.example.myapplication.webservice

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token")
    val myToken: String = ""
)