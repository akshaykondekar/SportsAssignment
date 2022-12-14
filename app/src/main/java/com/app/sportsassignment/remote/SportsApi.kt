package com.app.sportsassignment.remote

import com.app.sportsassignment.model.firstScreen.FirstScreen
import retrofit2.Response
import retrofit2.http.GET

//
// Created by Akshay Kondekar on 12/13/2022.
// Copyright (c) 2022 Appineers India. All rights reserved.
//
interface SportsApi {

    @GET("/sapk01222019186652.json")
    suspend fun getFirstScreenData(): Response<FirstScreen>
}