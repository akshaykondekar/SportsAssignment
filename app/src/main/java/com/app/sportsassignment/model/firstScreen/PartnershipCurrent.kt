package com.app.sportsassignment.model.firstScreen


import com.google.gson.annotations.SerializedName

data class PartnershipCurrent(
    @SerializedName("Balls")
    val balls: String,
    @SerializedName("Batsmen")
    val batsmen: List<BatsmenX>,
    @SerializedName("Runs")
    val runs: String
)