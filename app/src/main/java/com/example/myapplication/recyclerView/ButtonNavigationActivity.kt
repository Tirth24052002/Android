package com.example.myapplication.recyclerView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class ButtonNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_button_navigation)
                val bottomNav = findViewById<BottomNavigationView>(R.id.buttomNavigation)
                bottomNav.setOnNavigationItemSelectedListener(navListener)
                if (savedInstanceState == null) {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.fragment_container,
                        HomeFragment()
                    ).commit()
                }
            }
            private val navListener =
                BottomNavigationView.OnNavigationItemSelectedListener { item ->
                    var selectedFragment: Fragment? = null
                    when (item.itemId) {
                        R.id.nav_home -> selectedFragment = HomeFragment()
                        R.id.nav_favroites -> selectedFragment = FavouritesFragment()
                        R.id.nav_search -> selectedFragment = SearchFragment()
                    }
                    if (selectedFragment != null) {
                        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, selectedFragment).commit()
                    }
                    true
                }
        }
