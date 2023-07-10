package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.activity.DifferentActivity
import com.example.myapplication.fragment.FragmentActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    private lateinit var btnActivities: Button
    private lateinit var btnFragments: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
        setUpButtons()
    }

    private fun setUpButtons() {
        btnActivities = findViewById(R.id.btnActivities)
        btnActivities.setOnClickListener {
            val intent = Intent(this, DifferentActivity::class.java)
            startActivity(intent)
        }
        btnFragments = findViewById(R.id.btnFragment)
        btnFragments.setOnClickListener {
            val intent = Intent(this, FragmentActivity::class.java)
            startActivity(intent)
        }
    }
}