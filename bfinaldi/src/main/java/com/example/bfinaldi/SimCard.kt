package com.example.bfinaldi

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private  val serviceProvider: ServiceProvider) {      // Constructor Injection
    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}