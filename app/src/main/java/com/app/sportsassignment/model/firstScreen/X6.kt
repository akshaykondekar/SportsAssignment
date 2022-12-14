package com.app.sportsassignment.model.firstScreen


import com.google.gson.annotations.SerializedName

data class X6(
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Name_Short")
    val nameShort: String,
    @SerializedName("Players")
    val players: Players
)