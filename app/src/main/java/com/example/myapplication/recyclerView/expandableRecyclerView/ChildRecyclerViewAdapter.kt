package com.example.myapplication.recyclerView.expandableRecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ChildRecyclerViewAdapter(private val childList: List<ChildItem>) :
    RecyclerView.Adapter<ChildRecyclerViewAdapter.ChildViewHolder>() {

    inner class ChildViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.childLogoIv)
        val title: TextView = itemView.findViewById(R.id.childTitleTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.imageView.setImageResource(childList[position].img)
        holder.title.text = childList[position].title
    }

    override fun getItemCount(): Int {
        return childList.size
    }
}