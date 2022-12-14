package com.app.sportsassignment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.sportsassignment.model.firstScreen.FirstScreen
import com.app.sportsassignment.repository.SportsRepository
import com.app.sportsassignment.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

//
// Created by Akshay Kondekar on 12/13/2022.
// Copyright (c) 2022 Appineers India. All rights reserved.
//

class SportsViewModel(
    private val sportsRepository: SportsRepository
) : ViewModel() {

    val firstScreenData: MutableLiveData<Resource<FirstScreen>> = MutableLiveData()

    init {
        getFirstScreenData()
    }

    private fun getFirstScreenData() = viewModelScope.launch {
        firstScreenData.postValue(Resource.Loading())
        val response = sportsRepository.getFirstScreenData()
        firstScreenData.postValue(handleFirstScreenResponse(response))
    }

    private fun handleFirstScreenResponse(response: Response<FirstScreen>) : Resource<FirstScreen> {
        if(response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

}