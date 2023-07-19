package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.permissons.RuntimePermissionActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    private lateinit var btnDifferentPermission: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
        setUpBtn()
    }

    private fun setUpBtn() {
        btnDifferentPermission = findViewById(R.id.btnDifferentPermission)
        btnDifferentPermission.setOnClickListener {
            val intent = Intent(this, RuntimePermissionActivity::class.java)
            startActivity(intent)
        }
    }
}