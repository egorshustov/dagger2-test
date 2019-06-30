package com.egorshustov.dagger2test.dagger

import com.egorshustov.dagger2test.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DriverModule {
    @Provides
    @Singleton
    @JvmStatic
    fun provideDriver(): Driver {
        return Driver()
    }
}