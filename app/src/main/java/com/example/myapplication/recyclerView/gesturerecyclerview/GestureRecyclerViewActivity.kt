package com.example.myapplication.recyclerView.gesturerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar


class GestureRecyclerViewActivity : AppCompatActivity() {
    private lateinit var itemRv: RecyclerView
    private lateinit var itemList: ArrayList<String>
    private lateinit var itemAdapter: GestureAdapter
    private lateinit var archiveRv: RecyclerView
    private lateinit var archiveList: ArrayList<String>
    private lateinit var archiveAdapter: GestureAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gesture_recycler_view)
        itemRv = findViewById(R.id.item_rv)
        archiveRv = findViewById(R.id.archive_rv)
        itemList = ArrayList()
        archiveList = ArrayList()

        for (i in 1..10) {
            itemList.add("ITEM-${i}")
        }

        itemAdapter = GestureAdapter(itemList, this)
        val itemLayoutManager = LinearLayoutManager(this)
        itemRv.layoutManager = itemLayoutManager
        itemRv.adapter = itemAdapter
        archiveAdapter = GestureAdapter(archiveList, this)
        val archiveLayoutManager = LinearLayoutManager(this)
        archiveRv.layoutManager = archiveLayoutManager
        archiveRv.adapter = archiveAdapter
        swipeToGesture(itemRv)
    }

    private fun swipeToGesture(itemRv: RecyclerView?) {
        val swipeGesture = object : SwipeGesture(this) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                var actionBtnTapped = false
                try {
                    when (direction) {
                        ItemTouchHelper.LEFT -> {
                            val deleteItem = itemList[position]
                            itemList.removeAt(position)
                            itemAdapter.notifyItemRemoved(position)
                            val snackBar = Snackbar.make(
                                this@GestureRecyclerViewActivity.itemRv,
                                "Item Deleted",
                                Snackbar.LENGTH_LONG
                            ).addCallback(object : BaseTransientBottomBar.BaseCallback<Snackbar>() {
                                override fun onDismissed(
                                    transientBottomBar: Snackbar?, event: Int
                                ) {
                                    super.onDismissed(transientBottomBar, event)
                                }

                                override fun onShown(transientBottomBar: Snackbar?) {
                                    transientBottomBar?.setAction("UNDO") {
                                        itemList.add(position, deleteItem)
                                        itemAdapter.notifyItemInserted(position)
                                        actionBtnTapped = true
                                    }
                                    super.onShown(transientBottomBar)
                                }
                            }).apply {
                                animationMode = Snackbar.ANIMATION_MODE_FADE

                            }
                            snackBar.setActionTextColor(
                                ContextCompat.getColor(
                                    this@GestureRecyclerViewActivity, R.color.purple_200
                                )
                            )
                            snackBar.show()
                        }

                        ItemTouchHelper.RIGHT -> {
                            val archiveItem = itemList[position]
                            itemList.removeAt(position)
                            itemAdapter.notifyItemRemoved(position)
                            archiveList.add(archiveItem)
                            archiveAdapter.notifyItemInserted(position)
                            val snackBar = Snackbar.make(
                                this@GestureRecyclerViewActivity.itemRv,
                                "Item Archived",
                                Snackbar.LENGTH_LONG
                            ).addCallback(object : BaseTransientBottomBar.BaseCallback<Snackbar>() {
                                override fun onDismissed(
                                    transientBottomBar: Snackbar?, event: Int
                                ) {
                                    super.onDismissed(transientBottomBar, event)
                                }

                                override fun onShown(transientBottomBar: Snackbar?) {
                                    transientBottomBar?.setAction("UNDO") {
                                        itemList.add(position, archiveItem)
                                        itemAdapter.notifyItemInserted(position)
                                        archiveList.removeAt(archiveList.size - 1)
                                        archiveAdapter.notifyItemRemoved(archiveList.size)
                                        actionBtnTapped = true
                                    }
                                    super.onShown(transientBottomBar)
                                }
                            }).apply {
                                animationMode = Snackbar.ANIMATION_MODE_FADE
                            }
                            snackBar.setActionTextColor(
                                ContextCompat.getColor(
                                    this@GestureRecyclerViewActivity, R.color.teal_200
                                )
                            )
                            snackBar.show()
                        }
                    }
                } catch (e: Exception) {

                    Toast.makeText(this@GestureRecyclerViewActivity, e.message, Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        val touchHelper = ItemTouchHelper(swipeGesture)
        touchHelper.attachToRecyclerView(itemRv)
    }
}