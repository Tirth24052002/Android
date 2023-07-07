package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.recyclerView.AffermationsActivity
import com.example.myapplication.recyclerView.ButtonNavigationActivity
import com.example.myapplication.recyclerView.expandableRecyclerView.ExpandableRecyclerViewActivity
import com.example.myapplication.recyclerView.ListViewActivity
import com.example.myapplication.recyclerView.gesturerecyclerview.GestureRecyclerViewActivity

class MainActivity : AppCompatActivity() {
    lateinit var lvbtn: Button
    lateinit var btnAffermation: Button
    lateinit var btnButtomNavigation: Button
    lateinit var btnExpandableRecyclerView: Button
    lateinit var btnGestureRv: Button
    private var toolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpButton()
    }

    private fun setUpButton() {
        btnGestureRv = findViewById(R.id.btnGestureRv)
        lvbtn = findViewById(R.id.btnListView)
        btnAffermation = findViewById(R.id.buttonAffermation)
        btnButtomNavigation = findViewById(R.id.buttonBottomNavigation)
        btnExpandableRecyclerView = findViewById(R.id.btnExapndableRecyclerView)
        lvbtn.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        btnAffermation.setOnClickListener {
            val intent = Intent(this, AffermationsActivity::class.java)
            startActivity(intent)
        }

        btnButtomNavigation.setOnClickListener {
            val intent = Intent(this, ButtonNavigationActivity::class.java)
            startActivity(intent)
        }

        btnExpandableRecyclerView.setOnClickListener {
            val intent = Intent(this, ExpandableRecyclerViewActivity::class.java)
            startActivity(intent)
        }

        btnGestureRv.setOnClickListener {
            val intent = Intent(this, GestureRecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}