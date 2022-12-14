package com.app.sportsassignment.repository

import com.app.sportsassignment.remote.RetrofitInstance

//
// Created by Akshay Kondekar on 12/13/2022.
// Copyright (c) 2022 Appineers India. All rights reserved.
//
class SportsRepository {
    suspend fun getFirstScreenData() =
        RetrofitInstance.api.getFirstScreenData()
}