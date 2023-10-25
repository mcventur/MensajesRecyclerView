package com.mpd.pmdm.mensajesrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mpd.pmdm.mensajesrecyclerview.R
import com.mpd.pmdm.mensajesrecyclerview.databinding.MensajeLayoutBinding
import com.mpd.pmdm.mensajesrecyclerview.model.Message

class MessagesRVAdapter(private val messagesDataSet: List<Message>) :
    RecyclerView.Adapter<MessagesRVAdapter.MessagesViewHolder>() {
    class MessagesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //Hacemos la vinculación de la vista
        val binding = MensajeLayoutBinding.bind(view)

        //apuntamos con una variable a cada elemento del xml
        val authorImg = binding.msgImagen
        val authorName = binding.msgAuthor
        val msgBody = binding.msgBody

        /**
         * Aquí es donde insertamos cada dato del item correspondiente del modelo
         * en sus respectivos atributos de cada View
         */
        fun vincularDatos(message: Message) {
            authorImg.setImageResource(message.imgAutor)
            authorName.text = message.authorName
            msgBody.text = message.text
        }
    }

    /**
     * El RecyclerView llama a este método cuando necesita crear un nuevo ViewHolder
     * al ir haciendo scroll y apareciendo nuevos items
     *
     * Infla la vista e inicializa el ViewHolder, pero aún no vincula cada dato del modelo con
     * sus respectivos atributos en sus vistas
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.mensaje_layout, parent, false)
        return MessagesViewHolder(view)
    }

    override fun getItemCount(): Int = messagesDataSet.size

    /**
     * Este método se llama desde el RecyclerView para que el ViewHolder asociado
     * vincule un item del modelo (un Mensaje) con su correspondiente vista
     */
    override fun onBindViewHolder(holder: MessagesViewHolder, position: Int) {
        val message = messagesDataSet[position]
        holder.vincularDatos(message)
    }
}