package com.example.bfinaldi

import android.util.Log
import javax.inject.Inject

interface Battery{
    fun getPower()
}

/*
class Battery @Inject constructor() {       // Constructor Injection

    init {
        Log.i("MYTAG", "Battery Constructed")
    }

    fun getPower() {
        Log.i("MYTAG", "Battery power is available")
    }
}

*/
