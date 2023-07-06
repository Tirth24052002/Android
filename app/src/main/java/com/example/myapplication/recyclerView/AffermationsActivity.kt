package com.example.myapplication.recyclerView

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.recyclerView.adapter.ItemAdapter
import com.example.myapplication.recyclerView.data.Datasource
import com.example.myapplication.recyclerView.model.Affirmation

class AffermationsActivity : AppCompatActivity() {
    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var myDataset: List<Affirmation>
    private lateinit var recyclerView: RecyclerView
    private lateinit var dividerItemDecoration: DividerItemDecoration
    private lateinit var itemMargin: MarginRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affermations)
        myDataset = Datasource().loadAffirmations()
        recyclerView = findViewById(R.id.recycler_view)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        dividerItemDecoration = DividerItemDecoration(this, RecyclerView.VERTICAL)
        ResourcesCompat.getDrawable(resources, R.drawable.divider, null)?.let {
            dividerItemDecoration.setDrawable(it)
        }
        recyclerView.addItemDecoration(dividerItemDecoration)
//        itemMargin = MarginRecyclerView()
//        recyclerView.addItemDecoration(itemMargin)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}