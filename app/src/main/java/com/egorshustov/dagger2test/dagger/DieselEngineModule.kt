package com.egorshustov.dagger2test.dagger

import com.egorshustov.dagger2test.car.DieselEngine
import com.egorshustov.dagger2test.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindEngine(dieselEngine: DieselEngine): Engine
}