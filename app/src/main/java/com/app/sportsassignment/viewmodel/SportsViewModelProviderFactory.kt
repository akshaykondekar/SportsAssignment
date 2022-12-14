package com.app.sportsassignment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.sportsassignment.repository.SportsRepository

//
// Created by Akshay Kondekar on 12/13/2022.
// Copyright (c) 2022 Appineers India. All rights reserved.
//
class SportsViewModelProviderFactory(
    private val sportsRepository: SportsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SportsViewModel(sportsRepository) as T
    }
}