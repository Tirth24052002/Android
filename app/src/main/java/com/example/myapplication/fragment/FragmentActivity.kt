package com.example.myapplication.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.commit
import com.example.myapplication.R

class FragmentActivity : AppCompatActivity() {
    lateinit var btnfragment1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        setButtons()
    }

    private fun setButtons() {
        btnfragment1 = findViewById(R.id.btnFragment1)
        btnfragment1.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.fragment_host, TitleFragment::class.java, null)
            }
        }

        findViewById<Button>(R.id.btnFragment2).setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.fragment_host, DescriptionFragment::class.java, null)
            }
            Log.d("Text Message"," ${supportFragmentManager.backStackEntryCount}")
        }
    }
}