package com.example.myapplication.imagepicker

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myapplication.R

class ImagePickerActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var btnSetProfilePick: Button
    val getAction = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        val bitmap = it.data?.extras?.get("data") as Bitmap
        imageView.setImageBitmap(bitmap)
    }
    //private  var our_request_code: Int = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_picker)
        imageView = findViewById(R.id.ivPicProfilePic)
        btnSetProfilePick = findViewById(R.id.btnSetProfilePic)
        btnSetProfilePick.setOnClickListener {
            takePhoto()
        }
    }

    fun takePhoto() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if(intent.resolveActivity(packageManager) != null) {
           // startActivityForResult(intent,our_request_code)
            getAction.launch(intent)
        }
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == our_request_code && resultCode == RESULT_OK) {
//            val bitmap = data?.extras?.get("data") as Bitmap
//            imageView.setImageBitmap(bitmap)
//        }
//    }
}