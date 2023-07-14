package com.example.myapplication.searchactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SearchView
import com.example.myapplication.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    lateinit var binding: ActivitySearchBinding
    val user = arrayOf("Aakash","Abhishek", "Anurag","Bhavesh","Brian","Bob",
        "Christopher","Chris","David","Denovan","Erin","Erick","Evan","Fin","Fab","Gabrial",
        "Henil","Harsh", "Hari","Hiren","Ivan","Joseph","Jim","Jacob","Jignesh","Jay","Jaimin",
        "Kiran", "Kavin","Leon","Livingston","Lee","Manan","Mitesh","Meet","Navin","Neel","Nimesh",
        "Oran","Ozil","Patrick","Punit","Paresh","Quing","Quang","Rohit","Rushil", "Ronak","Ritish",
        "Ricky","Summit","Samir","Shusrut","Sandeep","Tirth","Tarang","Tim","Umesh","Vivek","Varun",
        "Vishal","Vaibhav","Veer","William","Willy","Xaviar", "Xenia","Xandra","Yash","Yashwant","Zion",
        "Zack","Zahra")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpItems()
    }
    private fun setUpItems() {
        val userAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, user)
        binding.lvSearch.adapter = userAdapter
        binding.svSearchBar.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                binding.svSearchBar.clearFocus()
                if(user.contains(p0)){
                    userAdapter.filter.filter(p0)
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                userAdapter.filter.filter(p0)
                return false
            }
        })
    }
}