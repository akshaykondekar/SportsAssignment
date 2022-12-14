package com.app.sportsassignment.model.firstScreen


import com.google.gson.annotations.SerializedName

data class ThisOver(
    @SerializedName("B")
    val b: String,
    @SerializedName("T")
    val t: String
)