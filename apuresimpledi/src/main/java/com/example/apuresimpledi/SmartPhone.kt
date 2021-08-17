package com.example.apuresimpledi


import android.util.Log
import javax.inject.Inject

/**
 *  SmartPhone  -> Battery
 *              -> SimCard      --> ServiceProvider
 *              -> MemoryCard
 */

// W/O DI
// class SmartPhone(private val battery: Battery, private val simCard: SIMCard, private val memoryCard: MemoryCard) {      // Constructor Injection
// With DI
class SmartPhone @Inject constructor(private val battery: Battery, private val simCard: SIMCard, private val memoryCard: MemoryCard) {      // Constructor Injection

    /*
        // Method Injection

        private lateinit var battery: Battery

        fun setBattery(inputBattery: Battery){      // Method Injection
            this.battery = inputBattery
        }

        // Field Injection (this field can be set from Main Activity)

        public lateinit var battery: Battery       // Field Injection

    */

    /*
    // W/O DI
    init {
        Log.i("MYTAG", "SmartPhone Constructed")
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
    }
    */

    // With DI
    fun makeACallWithRecording() {
        Log.i("MYTAG", "Calling.....")
    }
}