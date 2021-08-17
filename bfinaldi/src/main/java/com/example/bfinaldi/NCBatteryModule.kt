package com.example.bfinaldi

import dagger.Binds
import dagger.Module
import dagger.Provides
/*
@Module
class NCBatteryModule {

    @Provides
    fun providesNCBattery(nickelCadmiumBattery: NickelCadmiumBattery):Battery { // We are passing NickelCadmium Battery
        // directly as we have annotated NickelCadmiumBattery constructor with Inject

        //return NickelCadmiumBattery()
        return nickelCadmiumBattery
    }
}
*/
// Better Way
// As Battery is already injected then we can define this module as a abstract class.
// Abstract classes can't be provided but can be bindables

@Module
abstract class NCBatteryModule {

    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery):Battery
}