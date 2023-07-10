package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.R

class AnotherActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "Second Activities"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"On Start Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"On Resume Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"On Stop Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"On Pause Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"On Destroy Activity")
    }
}