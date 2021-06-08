package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class ForecastRepository {

    private val _weeklyForecast = MutableLiveData<List<DailyForcast>>()
    val weeklyForcast : LiveData<List<DailyForcast>> = _weeklyForecast

    fun loadForecast(zipcode: String){
        val randomvalues = List(7) { Random.nextFloat().rem(100)*100}
        val forecastItems = randomvalues.map{
            temp -> DailyForcast(temp,"partly cloudy")
        }

        _weeklyForecast.setValue(forecastItems)
    }
}