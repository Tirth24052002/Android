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
        setUpLayouts()
    }

    private fun setUpLayouts() {
        val linearBtn: Button = findViewById(R.id.btnLinearLayout)
        linearBtn.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Linear Layout Activity ", Toast.LENGTH_LONG).show()

            val constraintBtn: Button = findViewById(R.id.btnConstraintLayout)
            constraintBtn.setOnClickListener {
                val intent = Intent(this, ConstraintLayoutActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "Constraint Layout Activity ", Toast.LENGTH_LONG)
                    .show()
            }

            val gridBtn: Button = findViewById(R.id.btnGridLayout)
            gridBtn.setOnClickListener {
                val intent = Intent(this, GridLayoutActivity::class.java)
                startActivity(intent)
            }

            val tableBtn: Button = findViewById(R.id.btnTableLayoutButton)
            tableBtn.setOnClickListener {
                val intent = Intent(this, TableLayoutActivity::class.java)
                startActivity(intent)
            }

            val btnExercise: Button = findViewById(R.id.btnExerciseScree)
            btnExercise.setOnClickListener {
                val intent = Intent(this, WidgetsScreenActivity::class.java)
                startActivity(intent)

            }
        }
    }
}