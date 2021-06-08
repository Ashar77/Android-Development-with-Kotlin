package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val forecastRepository = ForecastRepository()

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
            //    Toast.makeText(this,zipcode+" is entered",Toast.LENGTH_SHORT).show()
                  forecastRepository.loadForecast(zipcode)
            }

            val forecastList : RecyclerView = findViewById(R.id.RVforecastList)
            forecastList.layoutManager = LinearLayoutManager(this);




        }

        val weeklyForecastObserver = Observer<List<DailyForcast>> {
            forecastItems -> Toast.makeText(this,"data updated",Toast.LENGTH_SHORT).show()
        }

        forecastRepository.weeklyForcast.observe(this,weeklyForecastObserver)

    }





}