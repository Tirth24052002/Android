package com.example.myapplication.activity

import android.app.PendingIntent
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.myapplication.R

class DifferentActivity : AppCompatActivity() {
    lateinit var btnAnotherActivity: Button
    lateinit var btnExplictIntent: Button
    companion object {
        private const val TAG = "First Activities"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_different)
        setUpButtons()
        val message =  intent.getStringExtra(Intent.EXTRA_TEXT)
        Log.d(TAG,message ?: "")
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
    private fun setUpButtons() {
        btnAnotherActivity = findViewById(R.id.btnAnotherActivity)
        btnAnotherActivity.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            startActivity(intent)
            val pendingIntent= PendingIntent.getActivity(this,1,intent, PendingIntent.FLAG_UPDATE_CURRENT )
        }
        btnExplictIntent = findViewById(R.id.btnExplicitIntent)
        btnExplictIntent.setOnClickListener {
            val intentWeb = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intentWeb)
        }
    }
}