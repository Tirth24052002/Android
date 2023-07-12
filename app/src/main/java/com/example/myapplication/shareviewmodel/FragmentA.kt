package com.example.myapplication.shareviewmodel


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R


class FragmentA : Fragment() {
    private var viewModel: SharedViewModel? = null
    private var editText: EditText? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val v: View = inflater.inflate(R.layout.fragment_a, container, false)
        editText = v.findViewById<EditText>(R.id.edit_text)
        val button = v.findViewById<Button>(R.id.button_ok)
        button.setOnClickListener { viewModel?.setText(editText!!.getText()) }
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = activity?.let { ViewModelProviders.of(it).get(SharedViewModel::class.java) }
        viewModel?.getText()?.observe(
            viewLifecycleOwner
        ) { charSequence -> editText!!.setText(charSequence) }
    }
}