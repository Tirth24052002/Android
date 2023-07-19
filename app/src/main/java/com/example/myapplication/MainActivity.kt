package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.webservice.view.RetroFitActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    private lateinit var btnRetroFit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
        setUpBtn()
    }

    private fun setUpBtn() {
        btnRetroFit = findViewById(R.id.btnRetro_fit)
        btnRetroFit.setOnClickListener {
            val intent = Intent(this, RetroFitActivity::class.java)
            startActivity(intent)
        }
    }
}