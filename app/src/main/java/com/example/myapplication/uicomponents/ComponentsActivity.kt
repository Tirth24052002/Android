package com.example.myapplication.uicomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class ComponentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_components)
        setupView()
    }


    private fun setupView() {
        val btnButton: Button = findViewById(R.id.buttonBtn)
        btnButton.setOnClickListener{
            val intent = Intent(this, ButtonActivity::class.java)
            startActivity(intent)
        }

        val btnToast: Button = findViewById(R.id.buttonToast)
        btnToast.setOnClickListener {
            val intent = Intent(this, ToastActivity::class.java)
            startActivity(intent)
        }

        val btnButtonTypes: Button = findViewById(R.id.buttonBtnTypes)
        btnButtonTypes.setOnClickListener {
            val intent = Intent(this, ButtonTypesActivity::class.java)
            startActivity(intent)
        }

        val btnTextinputlayout: Button = findViewById(R.id.buttonTextInputLayout)
        btnTextinputlayout.setOnClickListener {
            val intent = Intent(this, TextInputLayout::class.java)
            startActivity(intent)
        }

        val btnTabLayout: Button = findViewById(R.id.buttonTabLayout)
        btnTabLayout.setOnClickListener {
            val intent = Intent(this, TabLayoutActivity::class.java)
            startActivity(intent)
        }

        val btnAppBar: Button = findViewById(R.id.buttonAppBar)
        btnAppBar.setOnClickListener {
            val intent = Intent(this, AppBarActivity::class.java)
            startActivity(intent)
        }
    }
}