package com.example.myapplication.recyclerView.expandableRecyclerView


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ParentRecyclerViewAdapter(private val parentItemList: List<ParentItem>): RecyclerView.Adapter<ParentRecyclerViewAdapter.ParentRecyclerViewHolder>() {

    inner class ParentRecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val parentImageView: ImageView = itemView.findViewById(R.id.parentLogoIv)
        val parentTitle: TextView = itemView.findViewById(R.id.parentTitleTv)
        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.childRecyclerView)
        val constraintLayout: ConstraintLayout = itemView.findViewById(R.id.constraintLayout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return ParentRecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
       return parentItemList.size
    }

    override fun onBindViewHolder(holder: ParentRecyclerViewHolder, position: Int) {
        val parentItem = parentItemList[position]
        holder.parentTitle.text = parentItem.title
        holder.parentImageView.setImageResource(parentItem.image)
        holder.childRecyclerView.setHasFixedSize(true)
        holder.childRecyclerView.layoutManager = GridLayoutManager(holder.itemView.context,2)

        val adapter = ChildRecyclerViewAdapter(parentItem.childItemList)
        holder.childRecyclerView.adapter = adapter

        val isExpandable = parentItem.isExpandable
        holder.childRecyclerView.visibility = if(isExpandable) View.VISIBLE else View.GONE

        holder.constraintLayout.setOnClickListener {
            isItemExpanded(position)
            parentItem.isExpandable = !parentItem.isExpandable
            notifyItemChanged(position)
        }
    }
    private fun isItemExpanded(position: Int) {
        val temp = parentItemList.indexOfFirst {
            it.isExpandable
        }
        if (temp >= 0 && temp != position) {
            parentItemList[temp].isExpandable = false
            notifyItemChanged(temp)
        }
    }
}