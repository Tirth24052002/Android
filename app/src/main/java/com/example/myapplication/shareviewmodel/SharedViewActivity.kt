package com.example.myapplication.shareviewmodel


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import org.w3c.dom.Text


class SharedViewActivity : AppCompatActivity() {
    lateinit var tvcallback: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_view)
        fun someFunction(someCallBack: SomeCallBack) {
            val word = "nice"
            val letter = "f"
            if (word.contains(letter)) {
                someCallBack.onSuccess()
            } else {
                someCallBack.onFailure("$word does not contain $letter")
            }
        }
        tvcallback = findViewById(R.id.tvCallback)
        tvcallback.setOnClickListener {
            someFunction(object : SomeCallBack {
                override fun onSuccess() {
                    Toast.makeText(this@SharedViewActivity, "Inside Sucess", Toast.LENGTH_LONG)
                        .show()
                }

                override fun onFailure(error: String) {
                    Toast.makeText(
                        this@SharedViewActivity,
                        "Failure case $error",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            )
        }
        supportFragmentManager.beginTransaction()
            .add(R.id.container_a, FragmentA())
            .add(R.id.container_b, FragmentB())
            .commit()
    }
}

interface SomeCallBack {
    fun onSuccess()
    fun onFailure(error: String)
}