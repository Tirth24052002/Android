package com.example.myapplication.webservice.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.webservice.viewmodel.RetroFitViewModel

class RetroFitActivity : AppCompatActivity() {
     private lateinit var viewModel: RetroFitViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retro_fit)
        viewModel  = ViewModelProvider(this)[RetroFitViewModel::class.java]
    }

}