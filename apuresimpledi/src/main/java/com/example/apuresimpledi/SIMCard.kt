package com.example.apuresimpledi


import android.util.Log
import javax.inject.Inject

// W/O DI
// class SIMCard(private  val serviceProvider: ServiceProvider) {

// With DI
class SIMCard @Inject constructor(private  val serviceProvider: ServiceProvider) {      // Constructor Injection
    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}