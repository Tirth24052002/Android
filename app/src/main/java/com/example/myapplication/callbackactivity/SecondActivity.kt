package com.example.myapplication.callbackactivity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class SecondActivity : AppCompatActivity() {
    lateinit var btnGoback: Button

    companion object {
        private var myInterface: MyInterface? = null
        fun setInterfaceState(context: Context?) {
            myInterface = context as MyInterface?
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setBtn()
    }

    private fun setBtn() {
        btnGoback = findViewById(R.id.btnSecondActivity)
        btnGoback.setOnClickListener {
            finish()
            myInterface?.callBack("The Call Back")
        }
    }
}