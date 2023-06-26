package com.example.myapplication.uiwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R

class GridLayoutActivity : AppCompatActivity() {
     lateinit var radiogroup: RadioGroup
    var radioButton: RadioButton? = null
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)
        textView = findViewById(R.id.textView4)
        radiogroup = findViewById(R.id.radioGroup)
        val buttonApply: Button = findViewById(R.id.button2)
        buttonApply.setOnClickListener {
            val radioId: Int = radiogroup.checkedRadioButtonId
            radioButton = findViewById(radioId)
            textView?.setText("Your Choice is ${radioButton?.text}")
            checkButton(buttonApply)
        }

    }
        fun checkButton(v: View) {
            val radioId: Int = radiogroup.checkedRadioButtonId
            radioButton = findViewById(radioId)
            Toast.makeText(
                this,
                "The Selected Radio Button is ${radioButton?.text}",
                Toast.LENGTH_LONG
            ).show()
        }
}