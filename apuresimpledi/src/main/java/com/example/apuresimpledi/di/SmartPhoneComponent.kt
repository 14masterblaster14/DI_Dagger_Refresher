package com.example.apuresimpledi.di

import com.example.apuresimpledi.SmartPhone
import dagger.Component

@Component
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone
}