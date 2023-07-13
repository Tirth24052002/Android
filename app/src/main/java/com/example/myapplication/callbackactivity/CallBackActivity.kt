package com.example.myapplication.callbackactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.callbackactivity.SecondActivity.Companion.setInterfaceState

class CallBackActivity : AppCompatActivity(), MyInterface {
    lateinit var btnSecondActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_back)
        setBtn()
    }

    private fun setBtn() {
        btnSecondActivity = findViewById(R.id.btnFirstActivity)
        btnSecondActivity.setOnClickListener {
            setInterfaceState(this@CallBackActivity)
            val i = 2
            val intent = Intent(this@CallBackActivity, SecondActivity::class.java)
            startActivityForResult(intent, i)
        }
    }

    override fun callBack(data: String?) {
        Toast.makeText(this, "This the call from Second Activity ", Toast.LENGTH_LONG).show()
    }
}