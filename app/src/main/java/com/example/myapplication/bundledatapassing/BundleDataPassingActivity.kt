package com.example.myapplication.bundledatapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R

class BundleDataPassingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle_data_passing)
        supportFragmentManager.beginTransaction().replace(R.id.nav_container,First_Fragment()).commit()
    }
}