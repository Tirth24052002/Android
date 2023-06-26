package com.example.myapplication.uiwidgets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class ViewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutviews)
        setupLinearLayout()
        setupConstraintLayout()
        setupGridLayout()
    }

    private fun setupLinearLayout() {
        val uiWidgetsButton: Button = findViewById(R.id.btnLinearLayout)
        uiWidgetsButton.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Linear Layout Activity ", Toast.LENGTH_LONG).show()
        }
    }

    private fun setupConstraintLayout() {
        val uiWidgetsButton: Button = findViewById(R.id.btnConstraintLayout)
        uiWidgetsButton.setOnClickListener {
            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Constraint Layout Activity ", Toast.LENGTH_LONG)
                .show()
        }
    }

    private fun setupGridLayout() {
        val uiWidgetsButton: Button = findViewById(R.id.btnGridLayout)
        uiWidgetsButton.setOnClickListener {
            val intent = Intent(this, GridLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}