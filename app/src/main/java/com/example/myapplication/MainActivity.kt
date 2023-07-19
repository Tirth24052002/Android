package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.uicomponents.ComponentsActivity
import com.example.myapplication.uiwidgets.ViewsActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
           setupNavigationButtons()
    }

    private fun setupNavigationButtons() {
            val uiWidgetsButton: Button = findViewById(R.id.uiViewsBtn)
            uiWidgetsButton.setOnClickListener {
                val intent = Intent(this, ViewsActivity::class.java)
                startActivity(intent)
            }
            val uiComponentsBtn: Button = findViewById(R.id.buttonUIComponents)
        uiComponentsBtn.setOnClickListener {
            val intent = Intent(this, ComponentsActivity::class.java)
            startActivity(intent)
        }
    }
}
