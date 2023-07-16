package com.example.myapplication.webservice

import com.google.gson.annotations.SerializedName

data class Test(
    @SerializedName("birthData")
    val birthDate: String,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("roles")
    val roles: List<String>
)