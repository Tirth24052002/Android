package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.scrollactivity.ListViewActivity
import com.example.myapplication.searchactivity.SearchActivity
import com.example.myapplication.webView.WebViewActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    lateinit var btnSearchActivity: Button
    lateinit var btnNestedScrollView: Button
    lateinit var btnWebView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
        setUpButtons()
    }

    private fun setUpButtons() {
        btnSearchActivity = findViewById(R.id.btnSearchActivity)
        btnNestedScrollView = findViewById(R.id.btnNestedScrollView)
        btnWebView = findViewById(R.id.btnWebView)

        btnSearchActivity.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        btnNestedScrollView.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        btnWebView.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }

    }
}