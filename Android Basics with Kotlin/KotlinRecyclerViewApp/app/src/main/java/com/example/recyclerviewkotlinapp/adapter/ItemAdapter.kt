package com.example.recyclerviewkotlinapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlinapp.R
import com.example.recyclerviewkotlinapp.model.Affirmations

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */

class ItemAdapter(private val context: Context,private val dataSet: List<Affirmations>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){   //Add the code to extend your ItemAdapter from the abstract class RecyclerView.Adapter. Specify ItemAdapter.ItemViewHolder as the view holder type in angle brackets.

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.


    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view) {

        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)


    }


}