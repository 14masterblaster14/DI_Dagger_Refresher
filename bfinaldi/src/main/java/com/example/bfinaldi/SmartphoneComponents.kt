package com.example.bfinaldi

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [ScreenModule::class, NCBatteryModule::class])
interface SmartphoneComponents {

    // This is getter method for Smartphone component
    // Which we can inject in the required activity/ fragment using field injection

    //fun getSmartPhone(): Smartphone

    fun inject(mainActivity: MainActivity) // This is field injection for activity

}