package com.example.apuresimpledi


import android.util.Log
import javax.inject.Inject

// W/O DI
// class MemoryCard {

// With DI
class MemoryCard @Inject constructor() {        // Constructor Injection
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}