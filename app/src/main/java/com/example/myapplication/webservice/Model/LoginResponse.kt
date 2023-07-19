package com.example.myapplication.webservice.Model

import androidx.lifecycle.ViewModel
import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token")
    val myToken: String = ""
)