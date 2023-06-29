package com.example.myapplication.uicomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.R
import com.google.android.material.appbar.MaterialToolbar

class AppBarActivity : AppCompatActivity() {
    lateinit var topAppBar: MaterialToolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_bar)
        topAppBar = findViewById(R.id.top_App_Bar)
        topAppBar.setNavigationOnClickListener{
            Toast.makeText(this,"Navigation Icon Clicked", Toast.LENGTH_LONG).show()
        }

        topAppBar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.search_bar -> {
                    Toast.makeText(this, "Search Action Clicked", Toast.LENGTH_LONG).show()
                    true

                }

                R.id.camera -> {
                    Toast.makeText(this, "Camera Action Clicked", Toast.LENGTH_LONG).show()
                    true

                }

                R.id.more -> {
                    Toast.makeText(this, "More Action Clicked", Toast.LENGTH_LONG).show()
                    true

                }

                else -> {
                    false
                }
            }
        }
    }
}