package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.activity.DifferentActivity
import com.example.myapplication.bundledatapassing.BundleDataPassingActivity
import com.example.myapplication.callbackactivity.CallBackActivity
import com.example.myapplication.dictionaryapp.DictionaryAppActivity
import com.example.myapplication.fragment.FragmentActivity
import com.example.myapplication.imagepicker.ImagePickerActivity
import com.example.myapplication.navdatapassing.NavigationActivity
import com.example.myapplication.shareviewmodel.SharedViewActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    private lateinit var btnActivities: Button
    private lateinit var btnFragments: Button
    private lateinit var btnDictionaryApp: Button
    private lateinit var btnSharedView: Button
    private lateinit var btnCallBack: Button
    private lateinit var btnBundle: Button
    private lateinit var btnNavigation: Button
    private lateinit var btnImagePicker:Button

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
        btnCallBack = findViewById(R.id.btnCallback)
        btnBundle = findViewById(R.id.btnBundle)
        btnNavigation = findViewById(R.id.btnNavigation)
        btnImagePicker = findViewById(R.id.btnPicImage)

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

        btnCallBack.setOnClickListener {
            val intent = Intent(this, CallBackActivity::class.java)
            startActivity(intent)
        }

        btnBundle.setOnClickListener {
            val intent = Intent(this, BundleDataPassingActivity::class.java)
            startActivity(intent)
        }

        btnNavigation.setOnClickListener {
            val intent = Intent(this, NavigationActivity::class.java)
            startActivity(intent)
        }

        btnImagePicker.setOnClickListener {
            val intent = Intent(this, ImagePickerActivity::class.java)
            startActivity(intent)
        }
    }
}