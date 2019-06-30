package com.egorshustov.dagger2test.dagger

import com.egorshustov.dagger2test.car.Rims
import com.egorshustov.dagger2test.car.Tires
import com.egorshustov.dagger2test.car.Wheels
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class WheelsModule {
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Singleton
    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}