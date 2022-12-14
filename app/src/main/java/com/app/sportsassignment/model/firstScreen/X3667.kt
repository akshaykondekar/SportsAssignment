package com.app.sportsassignment.model.firstScreen


import com.google.gson.annotations.SerializedName

data class X3667(
    @SerializedName("Batting")
    val batting: Batting,
    @SerializedName("Bowling")
    val bowling: Bowling,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Position")
    val position: String
)