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
import android.widget.TextView
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
    lateinit var fnError: TextView
    lateinit var lnError: TextView
    lateinit var adrError: TextView
    lateinit var cityError: TextView
    lateinit var stateError: TextView
    lateinit var zipError: TextView
    lateinit var mobileError: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        spinnerSetup()
        validationSetup()
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


    private fun validationSetup() {
        btn = findViewById(R.id.buttonClose)
        firstName = findViewById(R.id.etFirstName)
        lastName = findViewById(R.id.etLastName)
        perAddress = findViewById(R.id.etAddress)
        perCity = findViewById(R.id.etCity)
        perState = findViewById(R.id.etState)
        perZipCode = findViewById(R.id.etZipCode)
        perMobileNo = findViewById(R.id.etMobileNumber)
        fnError = findViewById(R.id.fnError)
        lnError = findViewById(R.id.lnError)
        adrError = findViewById(R.id.adrError)
        stateError = findViewById(R.id.stateError)
        cityError = findViewById(R.id.cityError)
        zipError = findViewById(R.id.zipError)
        mobileError = findViewById(R.id.mobileError)
        btn.setOnClickListener {
            if(firstName.text.isEmpty() && firstName.text.count() <= 5){
                fnError.visibility = View.VISIBLE
               // firstName.setError("The erroe is somtirhoags", getDrawable(R.drawable.baseline_arrow_drop_down_24))
                //firstName.error = "Enter your first name"
            }
//            else if (firstName.text.count() < 5) {
//                firstName.error = "Name must contain at least 5 characters"
                //firstName.setError("",getDrawable(R.drawable.custom_shape))
           // }
            if(lastName.text.isEmpty()){
              //  lastName.error = "Enter your last name"
                lnError.visibility = View.VISIBLE
            }
            if(perAddress.text.isEmpty()){
               // perAddress.error = "Enter your email address"
                adrError.visibility = View.VISIBLE
            }
            if(perCity.text.isEmpty()){
               // perCity.error = "Enter your city"
                cityError.visibility = View.VISIBLE
            }
            if(perState.text.isEmpty()){
               // perState.error = "Enter your state"
                stateError.visibility = View.VISIBLE
            }
            if(perMobileNo.text.isEmpty()){
                //perMobileNo.error = "Enter your mobile no"
                mobileError.visibility = View.VISIBLE
            }
            if(perZipCode.text.isEmpty()){
                //perZipCode.error = "Enter your Zip code"
                zipError.visibility = View.VISIBLE
            }
//            else if (perZipCode.text.count() <=5) {
//                perZipCode.error = "Enter Valid Zip Code"
//            } else if (perZipCode.text.count() > 6) {
//                perZipCode.error = "Enter Valid Zip Code"
//            }
//            else if (perZipCode.text.count() <=5) {
//                perZipCode.error = "Enter Valid Zip Code"
//            } else if (perZipCode.text.count() > 6) {
//                perZipCode.error = "Enter Valid Zip Code"
//            }
            else {
                Toast.makeText(this, "You data had been saved successfully",Toast.LENGTH_LONG).show()
            }
        }
    }
}