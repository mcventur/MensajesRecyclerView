package com.mpd.pmdm.mensajesrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mpd.pmdm.mensajesrecyclerview.R
import com.mpd.pmdm.mensajesrecyclerview.model.Message

class MessagesRVAdapter(private val messagesDataSet:List<Message>):RecyclerView.Adapter<MessagesRVAdapter.MessagesViewHolder>() {
    class MessagesViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val authorImg :ImageView = view.findViewById(R.id.msg_imagen)
        val authorName : TextView = view.findViewById(R.id.msg_author)
        val msgBody :TextView = view.findViewById(R.id.msg_body)

        fun bind(message: Message){
            authorImg.setImageResource(message.imgAutor)
            authorName.text = message.authorName
            msgBody.text = message.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.mensaje_layout,parent, false)
        return MessagesViewHolder(view)
    }

    override fun getItemCount(): Int = messagesDataSet.size

    override fun onBindViewHolder(holder: MessagesViewHolder, position: Int) {
        val message = messagesDataSet[position]
        holder.bind(message)
    }
}