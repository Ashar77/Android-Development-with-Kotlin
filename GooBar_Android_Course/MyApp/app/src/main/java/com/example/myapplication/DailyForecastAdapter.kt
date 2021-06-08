package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class DailyForecastViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val tempText : TextView = view.findViewById(R.id.temptext)
    private  val description :  TextView = view.findViewById(R.id.descriptionTextView)

    fun bind( dailyForcast: DailyForcast ){
            tempText.text = dailyForcast.temp.toString()
            description.text = dailyForcast.description.toString()

    }

}


class DailyForecastAdapter() : ListAdapter<DailyForcast,DailyForecastViewHolder>(DIFF_CONFIG) {

    companion object{
        val DIFF_CONFIG = object : DiffUtil.ItemCallback<DailyForcast>(){
            override fun areItemsTheSame(oldItem: DailyForcast, newItem: DailyForcast): Boolean {
              return  oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: DailyForcast, newItem: DailyForcast): Boolean {
              return  oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyForecastViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_daily_forecast,parent,false)
        return DailyForecastViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: DailyForecastViewHolder, position: Int) {

        holder.bind(getItem(position))
    }

}