package com.example.myapplication.bundledatapassing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class First_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_fragment, container, false)

        val btn: Button = view.findViewById(R.id.btnSendData)
        btn.setOnClickListener {
            val editText: EditText = view.findViewById(R.id.etBundleData)
            val input = editText.text.toString()
            val bundle = Bundle()
            bundle.putString("data", input)
            val fragment = SecondFragment()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.nav_container, fragment)?.commit()
        }
        return view
    }
}