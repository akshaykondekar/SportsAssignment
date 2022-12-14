package com.app.sportsassignment.util

//
// Created by Akshay Kondekar on 12/13/2022.
// Copyright (c) 2022 Appineers India. All rights reserved.
//
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}