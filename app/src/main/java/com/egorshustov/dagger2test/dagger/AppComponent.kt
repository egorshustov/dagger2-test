package com.egorshustov.dagger2test.dagger

import com.egorshustov.dagger2test.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getDriver(): Driver
}