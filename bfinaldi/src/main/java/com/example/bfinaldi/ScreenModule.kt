package com.example.bfinaldi

import android.util.Log
import dagger.Module
import dagger.Provides

/**
 *  Note : It is discouraged to have state for modules (i.e. It should not have parameter)
 *  but sometimes it's needed.
 */


@Module
class ScreenModule (val screenSize:Int){    // This module has a state

    @Provides
    fun provideScreen(): Screen{
        Log.i("MYTAG","Size of the screen is $screenSize")
        return Screen()
    }
}