package com.app.sportsassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.app.sportsassignment.R
import com.app.sportsassignment.databinding.CvFirstTeamItemBinding
import com.app.sportsassignment.model.CustomPlayer
import com.app.sportsassignment.util.PlayerDiffUtil

//
// Created by Akshay Kondekar on 12/14/2022.
// Copyright (c) 2022 Appineers India. All rights reserved.
//
class FirstTeamAdapter(private val context: Context): RecyclerView.Adapter<FirstTeamAdapter.ViewHolder>() {

    var playerList = emptyList<CustomPlayer>()
    private var itemClickAction: ((player: CustomPlayer) -> Unit)? = null

    inner class ViewHolder(private val binding: CvFirstTeamItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(player: CustomPlayer) {
            with(binding){
                val playerName = "${player.fullName} (${player.position})"
                tvPlayerNameAndPosition.text = playerName

                when(player.type){
                    "Bowler" ->{
                        val playerStatus = player.bowling.wickets
                        tvPlayerType.text = "Wickets : $playerStatus"
                        ivType.setImageDrawable(context.getDrawable(R.drawable.bowling))
                    }
                    "Batsman" -> {
                        tvPlayerType.text = "Runs : ${player.batting.runs}"
                        ivType.setImageDrawable(context.getDrawable(R.drawable.batsman))
                    }
                    "Wicketkeeper" -> {
                        ivType.setImageDrawable(context.getDrawable(R.drawable.wicket_keeper))
                        if(player.bowling.average > player.batting.average){
                            tvPlayerType.text = "Wickets : ${player.bowling.wickets}"
                        }else{
                            tvPlayerType.text = "Runs : ${player.batting.runs}"
                        }
                    }
                    "Captain" -> {
                        ivType.setImageDrawable(context.getDrawable(R.drawable.captain))
                        if(player.bowling.average > player.batting.average){
                            tvPlayerType.text = "Wickets : ${player.bowling.wickets}"
                        }else{
                            tvPlayerType.text = "Runs : ${player.batting.runs}"
                        }
                    }
                }

                itemClickAction?.let { selectedArtist ->
                    cvFirstTeamPlayer.setOnClickListener {
                        selectedArtist(player)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        CvFirstTeamItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(playerList[position])
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    fun updateList(updatedPlayerList: List<CustomPlayer>) {
        val playerDiffUtil = PlayerDiffUtil(playerList, updatedPlayerList)
        val playerDiffResult = DiffUtil.calculateDiff(playerDiffUtil)
        this.playerList = updatedPlayerList
        playerDiffResult.dispatchUpdatesTo(this)
    }

    fun itemActionClick(action : (CustomPlayer) -> Unit){
        this.itemClickAction = action
    }
}