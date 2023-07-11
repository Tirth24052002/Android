package com.example.myapplication.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import com.example.myapplication.R

class TitleFragment: Fragment(R.layout.fragment_title) {
    private val sendButton by lazy {
        requireView().findViewById<Button>(R.id.btnSend)
    }

    private val message by lazy {
        requireView().findViewById<EditText>(R.id.sendData)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sendButton.setOnClickListener {
            val bundle: Bundle = Bundle().apply {
                putString("Message",message.text.toString())
            }
            setFragmentResult("RESULT_KEY",bundle)
        }
    }
}