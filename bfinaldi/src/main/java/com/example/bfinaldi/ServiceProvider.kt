package com.example.bfinaldi

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){        // Constructor Injection
    init {
        Log.i("MYTAG","Service Provider Constructed")
    }

    fun getServiceProvider(){
        Log.i("MYTAG","Service provider connected")
    }
}