package com.example.bfinaldi

import android.app.Application

class SmartphoneApplication :Application() {

    lateinit var smartphoneComponents: SmartphoneComponents

    override fun onCreate() {
        smartphoneComponents = initDagger()
        super.onCreate()
    }

    private fun initDagger(): SmartphoneComponents =
        DaggerSmartphoneComponents.builder()
            .screenModule(ScreenModule(6)) // need to add all modules which has states
            .build()


}