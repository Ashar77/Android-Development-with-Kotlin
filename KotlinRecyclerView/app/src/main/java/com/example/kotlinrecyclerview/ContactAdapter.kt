package com.example.kotlinrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// contactadapter will extend RecyclerView.adapter and RecyclerView.adapter is going to be permiterized by a viewholder...
// viewHolder is a wrapper around the adapter which allows the recyclerview to do the actual recycling

class ContactAdapter(private val context: Context , private val contacts: List<Contact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        
        fun bind(contact: Contact) {

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false)
        return RecyclerView.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)

    }


}