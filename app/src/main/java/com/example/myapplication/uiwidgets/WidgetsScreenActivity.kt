package com.example.myapplication.uiwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.myapplication.R
import com.google.android.material.snackbar.Snackbar

class WidgetsScreenActivity : AppCompatActivity() {
    lateinit var radioBtn: RadioButton
    lateinit var radioGrp: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widgets_screen)
        val fab: View = findViewById(R.id.btnSubmit)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Your Details is submitted", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }
        radioGrp = findViewById(R.id.btnRadioGroup)

        val buttonApply: Button = findViewById(R.id.btnToastMsg)
        buttonApply.setOnClickListener {
            val radioId: Int = radioGrp.checkedRadioButtonId
            radioBtn = findViewById(radioId)
            Toast.makeText(applicationContext,"The selectes Gender is ${radioBtn.text}", Toast.LENGTH_LONG).show()
        }
    }
}
