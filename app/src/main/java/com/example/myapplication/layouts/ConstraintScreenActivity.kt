package com.example.myapplication.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.myapplication.R

class ConstraintScreenActivity : AppCompatActivity() {
    lateinit var submitBtn: Button
    lateinit var feedbackspinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_screen)
        submitBtn = findViewById(R.id.buttonSubmit)
        submitBtn.setOnClickListener {
            Toast.makeText(this,"Your details has been submitted", Toast.LENGTH_LONG).show()
        }
        feedbackspinner = findViewById(R.id.spinnerfeedback)
        ArrayAdapter.createFromResource(
            this,
            R.array.feedback_array,
            android.R.layout.simple_dropdown_item_1line
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            feedbackspinner.adapter = adapter
        }
    }
}