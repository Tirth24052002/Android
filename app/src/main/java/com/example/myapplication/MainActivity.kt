package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.recyclerView.AffermationsActivity
import com.example.myapplication.recyclerView.ListViewActivity

class MainActivity : AppCompatActivity() {
    lateinit var lvbtn: Button
    lateinit var btnAffermation: Button
    private var toolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
        setUpButton()
    }

    private fun setUpButton() {
        lvbtn = findViewById(R.id.btnListView)
        btnAffermation = findViewById(R.id.buttonAffermation)
        lvbtn.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }
        btnAffermation.setOnClickListener {
            val intent = Intent(this, AffermationsActivity::class.java)
            startActivity(intent)
        }
    }
}