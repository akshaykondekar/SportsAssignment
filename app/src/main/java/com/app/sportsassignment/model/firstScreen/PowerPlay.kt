package com.app.sportsassignment.model.firstScreen


import com.google.gson.annotations.SerializedName

data class PowerPlay(
    @SerializedName("PP1")
    val pP1: String,
    @SerializedName("PP2")
    val pP2: String
)