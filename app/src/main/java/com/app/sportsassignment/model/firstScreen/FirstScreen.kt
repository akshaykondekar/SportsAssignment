package com.app.sportsassignment.model.firstScreen


import com.google.gson.annotations.SerializedName

data class FirstScreen(
    @SerializedName("Innings")
    val innings: List<Inning>,
    @SerializedName("Matchdetail")
    val matchdetail: Matchdetail,
    @SerializedName("Notes")
    val notes: Notes,
    @SerializedName("Nuggets")
    val nuggets: List<String>,
    @SerializedName("Teams")
    val teams: Teams
)