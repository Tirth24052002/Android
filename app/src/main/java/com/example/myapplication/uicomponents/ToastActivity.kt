package com.example.myapplication.uicomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.R
import com.google.android.material.snackbar.Snackbar

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)
        setUpToast()
    }

    private fun setUpToast() {
        val toast: Button = findViewById(R.id.btnToast)
        toast.setOnClickListener {
            Toast.makeText(applicationContext,"The Default toast is here", Toast.LENGTH_LONG).show()
        }

        val customToast = findViewById<Button>(R.id.btnCustomToast)
        customToast.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                view = layoutInflater.inflate(
                    R.layout.toast_layout,
                    findViewById(R.id.toast_view)
                )
                show()
            }
        }

        val snackBarMsg: Button = findViewById(R.id.buttonSnackBar)
        snackBarMsg.setOnClickListener { view ->
                Snackbar.make(view, "The Snack Bar is here", Snackbar.ANIMATION_MODE_SLIDE)
                    .setAction("Action", null)
                    .show()
        }

        val snackBarActionMsg = findViewById<Button>(R.id.buttonSnackBarAction)
        snackBarActionMsg.setOnClickListener {
            Snackbar.make(
                it,
                getString(R.string.snack_bar_with_action),
                Snackbar.LENGTH_LONG
            )
                .setAction("Action") {
                    Toast.makeText(
                        this,
                        getString(R.string.snack_bar_tapped),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .show()
        }
    }
}