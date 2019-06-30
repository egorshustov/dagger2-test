package com.egorshustov.dagger2test

import android.app.Application
import com.egorshustov.dagger2test.dagger.AppComponent
import com.egorshustov.dagger2test.dagger.DaggerAppComponent

class ExampleApp : Application() {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}