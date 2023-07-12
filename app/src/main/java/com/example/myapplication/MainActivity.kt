package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.activity.DifferentActivity
import com.example.myapplication.dictionaryapp.DictionaryAppActivity
import com.example.myapplication.fragment.FragmentActivity
import com.example.myapplication.shareviewmodel.SharedViewActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    private lateinit var btnActivities: Button
    private lateinit var btnFragments: Button
    private lateinit var btnDictionaryApp: Button
    private lateinit var btnSharedView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
        setUpButtons()
    }

    private fun setUpButtons() {
        btnActivities = findViewById(R.id.btnActivities)
        btnFragments = findViewById(R.id.btnFragment)
        btnDictionaryApp = findViewById(R.id.btnDictionaryApp)
        btnSharedView = findViewById(R.id.btnSharedViewModel)

        btnActivities.setOnClickListener {
            val intent = Intent(this, DifferentActivity::class.java)
            startActivity(intent)
        }

        btnFragments.setOnClickListener {
            val intent = Intent(this, FragmentActivity::class.java)
            startActivity(intent)
        }

        btnDictionaryApp.setOnClickListener {
            val intent = Intent(this, DictionaryAppActivity::class.java)
            startActivity(intent)
        }

        btnSharedView.setOnClickListener {
            val intent = Intent(this, SharedViewActivity::class.java)
            startActivity(intent)
        }
    }
}