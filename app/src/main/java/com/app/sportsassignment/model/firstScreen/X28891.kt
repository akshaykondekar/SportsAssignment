package com.app.sportsassignment.model.firstScreen


import com.google.gson.annotations.SerializedName

data class X28891(
    @SerializedName("Batting")
    val batting: Batting,
    @SerializedName("Bowling")
    val bowling: Bowling,
    @SerializedName("Iscaptain")
    val iscaptain: Boolean,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Position")
    val position: String
)