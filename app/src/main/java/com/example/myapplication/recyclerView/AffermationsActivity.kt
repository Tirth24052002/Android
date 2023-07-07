package com.example.myapplication.recyclerView

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.example.myapplication.R
import com.example.myapplication.recyclerView.adapter.ItemAdapter
import com.example.myapplication.recyclerView.data.Datasource
import com.example.myapplication.recyclerView.model.Affirmation


class AffermationsActivity : AppCompatActivity() {
    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var myDataset: List<Affirmation>
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affermations)
        myDataset = Datasource().loadAffirmations()
        recyclerView = findViewById(R.id.recycler_view)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
        val dividerItemDecoration: ItemDecoration =
            DividerItemDecorator(ContextCompat.getDrawable(applicationContext, R.drawable.divider)!!)
        recyclerView.addItemDecoration(dividerItemDecoration)
        recyclerView.addOnItemTouchListener(
            RecyclerItemClickListener(applicationContext, recyclerView, object : RecyclerItemClickListener.OnItemClickListener {
                    override fun onItemClick(view: View?, position: Int) {
                        Toast.makeText(this@AffermationsActivity," Recycler View Item is clicked $position",Toast.LENGTH_SHORT).show()
                    }

                    override fun onLongItemClick(view: View?, position: Int) {
                        Toast.makeText(this@AffermationsActivity, " Recycler View $position  item  is long clicked", Toast.LENGTH_LONG).show()
                    }
                })
        )
    }
}