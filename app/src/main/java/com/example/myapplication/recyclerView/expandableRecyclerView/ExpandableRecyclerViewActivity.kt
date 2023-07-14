package com.example.myapplication.recyclerView.expandableRecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.recyclerView.RecyclerItemClickListener

class ExpandableRecyclerViewActivity : AppCompatActivity() {
    private lateinit var parentRecyclerView: RecyclerView
    private lateinit var parentList: ArrayList<ParentItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_recycler_view)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        parentRecyclerView = findViewById(R.id.parentRecyclerView)
        parentRecyclerView.setHasFixedSize(true)
        parentRecyclerView.layoutManager = LinearLayoutManager(this)
        parentList = ArrayList()
        prepareData()
        val adapter = ParentRecyclerViewAdapter(parentList)
        parentRecyclerView.adapter = adapter
        parentRecyclerView.addOnItemTouchListener(
            RecyclerItemClickListener(applicationContext, parentRecyclerView, object : RecyclerItemClickListener.OnItemClickListener {
                override fun onItemClick(view: View?, position: Int) {
                    Toast.makeText(this@ExpandableRecyclerViewActivity," Recycler View Item is clicked $position",
                        Toast.LENGTH_SHORT).show()
                }

                override fun onLongItemClick(view: View?, position: Int) {
                    parentList.removeAt(position)
                    adapter.notifyItemRemoved(position)
                }

            })
        )
    }

    private fun  prepareData() {
        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("C", R.drawable.c))
        childItems1.add(ChildItem("C++", R.drawable.cplusplus))
        childItems1.add(ChildItem("Java", R.drawable.java))
        childItems1.add(ChildItem("C#", R.drawable.csharp))
        parentList.add(ParentItem("Game Development", R.drawable.console, childItems1))


        val childItem2 = ArrayList<ChildItem>()
        childItem2.add(ChildItem("Kotlin", R.drawable.kotlin))
        childItem2.add(ChildItem("XML", R.drawable.xml))
        childItem2.add(ChildItem("Java", R.drawable.java))
        parentList.add(ParentItem("Android Development", R.drawable.android, childItem2))

        val childItem3 = ArrayList<ChildItem>()
        childItem3.add(ChildItem("JavaScript", R.drawable.javascript))
        childItem3.add(ChildItem("HTML", R.drawable.html))
        childItem3.add(ChildItem("CSS", R.drawable.css))
        parentList.add(ParentItem("Front End Web", R.drawable.front_end, childItem3))

        val childItem4 = ArrayList<ChildItem>()
        childItem4.add(ChildItem("Julia", R.drawable.julia))
        childItem4.add(ChildItem("Python", R.drawable.python))
        childItem4.add(ChildItem("R", R.drawable.r))
        parentList.add(ParentItem("Artificial Intelligence", R.drawable.ai, childItem4))

        val childItem5 = ArrayList<ChildItem>()
        childItem5.add(ChildItem("Java", R.drawable.java))
        childItem5.add(ChildItem("Python", R.drawable.python))
        childItem5.add(ChildItem("PHP", R.drawable.php))
        childItem5.add(ChildItem("JavaScript", R.drawable.javascript))
        parentList.add(ParentItem("Back End Web", R.drawable.backend, childItem5))
    }
}