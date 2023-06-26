package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.uiwidgets.ViewsActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
           setupNavigationButtons()
    }

    private fun setupNavigationButtons() {
            val uiWidgetsButton: Button = findViewById(R.id.viewButton);
            uiWidgetsButton.setOnClickListener {
                val intent = Intent(this, ViewsActivity::class.java)
                startActivity(intent)
            }
    }
}
