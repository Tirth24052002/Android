package com.example.myapplication.layouts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.example.myapplication.R

class EditProfileActivity : AppCompatActivity() {
    lateinit var countryspinner: Spinner
    lateinit var btn: Button
    lateinit var firstName: EditText
    lateinit var lastName: EditText
    lateinit var perAddress: EditText
    lateinit var perCity: EditText
    lateinit var perState: EditText
    lateinit var perZipCode: EditText
    lateinit var perMobileNo: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        spinnerSetup()
        validatioSetup()
    }
    private fun spinnerSetup(){
        countryspinner = findViewById(R.id.spinnerSelectCountry)
        ArrayAdapter.createFromResource(
            this,
            R.array.countries_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            countryspinner.adapter = adapter
        }
    }

    private fun validatioSetup() {
        btn = findViewById(R.id.buttonClose)
        firstName = findViewById(R.id.etFirstName)
        lastName = findViewById(R.id.etLastName)
        perAddress = findViewById(R.id.etAddress)
        perCity = findViewById(R.id.etCity)
        perState = findViewById(R.id.etState)
        perZipCode = findViewById(R.id.etZipCode)
        perMobileNo = findViewById(R.id.etMobileNumber)
        btn.setOnClickListener {
            if(firstName.text.isEmpty() && firstName.text.count() <= 5){
                firstName.error = "Enter first Name"
            } else if (firstName.text.count() < 5) {
                firstName.error = "Name must contain at least 5 characters"
            }
            if(lastName.text.isEmpty()){
                lastName.error = "Enter your last name"
            }
            if(perAddress.text.isEmpty()){
                perAddress.error = "Enter your email address"
            }
            if(perCity.text.isEmpty()){
                perCity.error = "Enter your city"
            }
            if(perState.text.isEmpty()){
                perState.error = "Enter your state"
            }
            if(perMobileNo.text.isEmpty()){
                perMobileNo.error = "Enter your mobile no"
            }
            if(perZipCode.text.isEmpty()){
                perZipCode.error = "Enter your Zip code"
            } else if (perZipCode.text.count() <=5) {
                perZipCode.error = "Enter Valid Zip Code"
            } else if (perZipCode.text.count() > 6) {
                perZipCode.error = "Enter Valid Zip Code"
            }
            else {
                Toast.makeText(this, "You data had been saved successfully",Toast.LENGTH_LONG).show()
            }
        }
    }
}