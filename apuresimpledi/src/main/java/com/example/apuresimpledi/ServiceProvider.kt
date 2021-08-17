
package com.example.apuresimpledi

import android.util.Log
import javax.inject.Inject

// W/O DI
//class ServiceProvider {

// With DI
class ServiceProvider @Inject constructor(){        // Constructor Injection
    init {
        Log.i("MYTAG","Service Provider Constructed")
    }

    fun getServiceProvider(){
        Log.i("MYTAG","Service provider connected")
    }
}