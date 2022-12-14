package com.app.sportsassignment.util

import androidx.recyclerview.widget.DiffUtil
import com.app.sportsassignment.model.CustomPlayer

class PlayerDiffUtil(
    private val oldList: List<CustomPlayer>,
    private val newList: List<CustomPlayer>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].position == newList[newItemPosition].position
    }
}