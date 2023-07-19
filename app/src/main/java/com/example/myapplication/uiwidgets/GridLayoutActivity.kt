package com.example.myapplication.uiwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R
import com.google.android.material.snackbar.Snackbar

class GridLayoutActivity : AppCompatActivity() {
     lateinit var radiogroup: RadioGroup
    var radioButton: RadioButton? = null
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)
        textView = findViewById(R.id.selectedView)
        radiogroup = findViewById(R.id.radioGroupNumbers)
        val buttonApply: Button = findViewById(R.id.btnApply)
        buttonApply.setOnClickListener {
            val radioId: Int = radiogroup.checkedRadioButtonId
            radioButton = findViewById(radioId)
            textView?.setText("Your Choice is ${radioButton?.text}")
            checkButton(buttonApply)
            val fab: View = findViewById(R.id.btnDone)
            fab.setOnClickListener { view ->
                Snackbar.make(view, "All CHed Snack Bar", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
                val intent = Intent(this, ViewsActivity::class.java)
                startActivity(intent)
            }
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