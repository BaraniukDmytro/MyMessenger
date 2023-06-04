package com.example.mymesenger.model

data class MessageModel(
    var message : String? = "",
    val senderId : String? = "",
    val timeStamp : Long? = 0
)
