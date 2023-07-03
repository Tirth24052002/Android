package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.layouts.ConstraintLayoutActivity
import com.example.myapplication.layouts.ConstraintScreenActivity
import com.example.myapplication.layouts.CoordinatorLayoutActivity
import com.example.myapplication.layouts.EditProfileActivity
import com.example.myapplication.layouts.FrameLayoutActivity
import com.example.myapplication.layouts.GridLayoutActivity
import com.example.myapplication.layouts.LinearLayoutActivity
import com.example.myapplication.layouts.RelativeLayoutActivity

class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.myTollBar)
        setSupportActionBar(toolbar)
        layoutSetup()
    }

    private fun  layoutSetup() {
        val relativeLayout = findViewById<Button>(R.id.buttonRealtiveLayout)
        relativeLayout.setOnClickListener {
            val intent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

        val linearLayout = findViewById<Button>(R.id.buttonLinearLayout)
        linearLayout.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        val gridLayout = findViewById<Button>(R.id.buttonGridLayout)
        gridLayout.setOnClickListener {
            val intent = Intent(this, GridLayoutActivity::class.java)
            startActivity(intent)
        }

        val constraintLayout = findViewById<Button>(R.id.buttonConstraintLayout)
        constraintLayout.setOnClickListener {
            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }

        val frameLayout = findViewById<Button>(R.id.buttonFrameLayout)
        frameLayout.setOnClickListener {
            val intent = Intent(this, FrameLayoutActivity::class.java)
            startActivity(intent)
        }

        val coordinatorLayout = findViewById<Button>(R.id.buttonCoordinatorLayout)
        coordinatorLayout.setOnClickListener {
            val intent = Intent(this, CoordinatorLayoutActivity::class.java)
            startActivity(intent)
        }

        val constraintScreen = findViewById<Button>(R.id.buttonConstraintScreen)
        constraintScreen.setOnClickListener {
            val intent = Intent(this, ConstraintScreenActivity::class.java)
            startActivity(intent)
        }

        val editProfilrBtn = findViewById<Button>(R.id.buttonEditProfile)
        editProfilrBtn.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }
    }
}