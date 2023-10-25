package com.mpd.pmdm.mensajesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mpd.pmdm.mensajesrecyclerview.adapter.MessagesRVAdapter
import com.mpd.pmdm.mensajesrecyclerview.data.MessagesSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val messagesRecycler:RecyclerView = findViewById(R.id.mensajesRecyclerView)
        val messagesDataSet = MessagesSource.data
        messagesRecycler.adapter = MessagesRVAdapter(messagesDataSet)
    }
}