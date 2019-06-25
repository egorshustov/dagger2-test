package com.egorshustov.dagger2test.dagger

import com.egorshustov.dagger2test.car.DieselEngine
import com.egorshustov.dagger2test.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}