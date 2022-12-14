package com.app.sportsassignment.model.firstScreen


import com.google.gson.annotations.SerializedName

data class Bowling(
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Style")
    val style: String,
    @SerializedName("Wickets")
    val wickets: String
)