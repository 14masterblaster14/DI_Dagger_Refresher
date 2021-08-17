package com.example.bfinaldi

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 *  This is Final DI example
 *  Refer Graph : @Drawable/di_graph.png
 *
 *  SmartPhone  -> Battery <Interface>
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
 *  e.g. Battery Interface
 */


@Singleton
class Smartphone @Inject constructor (val battery: Battery, val simCard: SimCard,val memoryCard: MemoryCard, val screen:Screen){

    fun makeACallWithRecording() {
        Log.i("MYTAG", "Calling.....")
    }
}