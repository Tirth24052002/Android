package com.example.myapplication.scrollactivity


import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import java.util.LinkedList


class ListViewActivity : AppCompatActivity() {
    private var strings: LinkedList<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val listView = findViewById<View>(R.id.list_view) as ListView
        setDummyData()
        val adapter = ArrayAdapter<String>(this, R.layout.item_list_view, R.id.text_view, strings!!)
        listView.adapter = adapter
    }

    private fun setDummyData() {
        strings = LinkedList()
        for (i in 0..9) {
            strings?.add(getString(R.string.long_text))
        }
    }
}