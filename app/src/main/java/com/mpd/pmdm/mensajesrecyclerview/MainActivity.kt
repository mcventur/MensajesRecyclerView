package com.mpd.pmdm.mensajesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mpd.pmdm.mensajesrecyclerview.adapter.MessagesRVAdapter
import com.mpd.pmdm.mensajesrecyclerview.data.MessagesSource
import com.mpd.pmdm.mensajesrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val messagesRecycler:RecyclerView = binding.mensajesRecyclerView
        val messagesDataSet = MessagesSource.data
        messagesRecycler.adapter = MessagesRVAdapter(messagesDataSet)
    }
}