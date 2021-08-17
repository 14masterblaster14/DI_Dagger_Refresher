package com.example.apuresimpledi

import android.util.Log
import javax.inject.Inject

// W/O DI
// class Battery() {
// With DI
class Battery @Inject constructor() {       // Constructor Injection

    init {
        Log.i("MYTAG","Battery Constructed")
    }

    fun getPower(){
        Log.i("MYTAG","Battery power is available")
    }
}