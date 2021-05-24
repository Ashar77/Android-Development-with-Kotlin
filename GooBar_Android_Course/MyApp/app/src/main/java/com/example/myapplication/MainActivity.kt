package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val zipcodeEditText : EditText = findViewById(R.id.editTextzipcode)
        val enterButton : Button = findViewById(R.id.enterzipbutton)

        enterButton.setOnClickListener{
          //Toast.makeText(this,"button is clicked",Toast.LENGTH_SHORT).show()

            val zipcode : String = zipcodeEditText.text.toString()

            if(zipcode.length != 5){
                Toast.makeText(this,R.string.zipcode_error_entry,Toast.LENGTH_SHORT).show()
            }

            else{
                Toast.makeText(this,zipcode+" is entered",Toast.LENGTH_SHORT).show()
            }




        }


    }





}