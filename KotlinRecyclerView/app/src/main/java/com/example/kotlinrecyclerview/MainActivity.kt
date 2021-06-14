package com.example.kotlinrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = createContacts()
    }

    private fun createContacts():List<Contact> {
        val contacts = mutableListOf<Contact>()
        for(i in 1..100){
            contacts.add(Contact("Person #", i))
        }
        return contacts
    }
}