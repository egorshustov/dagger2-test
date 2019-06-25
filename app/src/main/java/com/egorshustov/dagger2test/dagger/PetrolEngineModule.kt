package com.egorshustov.dagger2test.dagger

import com.egorshustov.dagger2test.car.Engine
import com.egorshustov.dagger2test.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine
}