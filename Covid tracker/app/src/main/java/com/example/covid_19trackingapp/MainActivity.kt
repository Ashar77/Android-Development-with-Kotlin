package com.example.covid_19trackingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fetch national data
        val gson = GsonBuilder().create()
        val retrofit = Retrofit.Builder().baseUrl("todo").addConverterFactory(GsonConverterFactory.create(gson)).build()

        //fetch state data


    }
}