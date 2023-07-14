package com.example.myapplication.bundledatapassing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.second_fragment, container, false)
        val textView: TextView = view.findViewById(R.id.tvSetData)
        val args = this.arguments
        val inputData = args?.get("data")
        textView.text = inputData.toString()
        return view
    }
}