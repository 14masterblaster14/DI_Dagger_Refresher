package com.example.apuresimpledi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apuresimpledi.di.DaggerSmartPhoneComponent

/**
 *  This is simple DI example with Constructor Injection
 *  Refer Graph : @Drawable/di_graph.png
 *
 *  SmartPhone  -> Battery
 *              -> SimCard     --> ServiceProvider
 *              -> MemoryCard
 *
 *  Types of DI -> Constructor Injection (Most preferred way)
 *              -> Method Injection
 *              -> Field Injection
 *
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** Without DI **/
        /*
        val smartPhone = SmartPhone(
            Battery(),
            SIMCard(ServiceProvider()),
            MemoryCard()
        ) // Constructor Injection

        smartPhone.makeACallWithRecording()
        */
        /** With DI **/

        DaggerSmartPhoneComponent
            .create()
            .getSmartPhone()
            .makeACallWithRecording()
    }

}

/*
O/P:-

I/MYTAG: Battery Constructed
I/MYTAG: Service Provider Constructed
I/MYTAG: SIM Card Constructed
I/MYTAG: Memory Card Constructed
I/MYTAG: SmartPhone Constructed

I/MYTAG: Battery power is available
I/MYTAG: Service provider connected
I/MYTAG: Memory space available

I/MYTAG: Calling.....
*/