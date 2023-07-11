package com.example.myapplication.fragment

import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import com.example.myapplication.R

class DescriptionFragment: Fragment(R.layout.fragment_description) {

    private var something: String = "Some Text"
    private val messageTv: TextView by lazy {
        requireView().findViewById(R.id.tvgetData)
    }
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        setFragmentResultListener("RESULT_KEY") {Key, bundle ->
            val message = bundle.getString("Message","")
            messageTv.text = message
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.getString(something)
    }
}