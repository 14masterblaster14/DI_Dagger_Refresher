package com.example.bfinaldi

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor(): Battery {

    override fun getPower() {

        Log.i("MYTAG", "NickelCadmiumBattery power is available")
    }
}