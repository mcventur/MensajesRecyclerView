package com.mpd.pmdm.mensajesrecyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Message(val authorName:String, @DrawableRes val imgAutor:Int, val text:String)

