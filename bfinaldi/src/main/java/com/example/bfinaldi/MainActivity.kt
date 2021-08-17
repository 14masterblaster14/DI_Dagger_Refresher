package com.example.bfinaldi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import javax.inject.Inject

/**
 *  This is Final DI example
 *  Refer Graph : @Drawable/di_graph.png
 *
 *  SmartPhone  -> Battery
 *              -> SimCard     --> ServiceProvider
 *              -> MemoryCard
 *              -> Screen <System Class>
 *
 *  Types of DI -> Constructor Injection (Most preferred way)
 *              -> Method Injection
 *              -> Field Injection
 *
 *  Class Dependencies:
 *  Always prefer Constructor injections.But when we don't own classes like third party lib,
 *  system/ framework classes then we need to create modules to provide these classes.
 *  e.g. Screen Class
 *
 *  Interface Dependencies:
 *  Interfaces doesn't have constructors.So we need to create a class which implements these interfaces and provide
 *  them.
 *  We can define Interface Modules as abstarct class and bind it's abstract function to bind this interface.
 *  e.g. Battery Interface
 *
 *
 */


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone: Smartphone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
           DaggerSmartphoneComponent
               .create()
               .getSmartPhone()
               .makeACallWithRecording()

            */

//        DaggerSmartphoneComponent
//            .create()        // We can't use create function if any of our module has a state instead we need to use the builder.
//            .inject(this)

        /*
        DaggerSmartphoneComponent.builder()
            .screenModule(ScreenModule(6)) // need to add all modules which has states
            .build()
            .inject(this)

        smartPhone.makeACallWithRecording()
        */

        /** Most preferred way to construct Dagger component in subclass of an Application class otherwise
        we need to create this component in all activities in the application. */

        (application as SmartphoneApplication).smartphoneComponents
            .inject(this)

        smartPhone.makeACallWithRecording()
    }
}


/*
O/P :-

2021-08-09 16:23:45.060 17273-17273/com.example.di_dagger_final I/MYTAG: Battery Constructed
2021-08-09 16:23:45.061 17273-17273/com.example.di_dagger_final I/MYTAG: Service Provider Constructed
2021-08-09 16:23:45.061 17273-17273/com.example.di_dagger_final I/MYTAG: SIM Card Constructed
2021-08-09 16:23:45.061 17273-17273/com.example.di_dagger_final I/MYTAG: Memory Card Constructed
2021-08-09 16:23:45.061 17273-17273/com.example.di_dagger_final I/MYTAG: Screen Constructed
2021-08-09 16:23:45.061 17273-17273/com.example.di_dagger_final I/MYTAG: Calling.....

 */