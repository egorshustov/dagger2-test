package com.egorshustov.dagger2test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.egorshustov.dagger2test.car.Car
import com.egorshustov.dagger2test.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent = (application as ExampleApp).getAppComponent()
            .getActivityComponent(DieselEngineModule(120))

        activityComponent.inject(this)

        car1.drive()
        car2.drive()
    }

    companion object {
        const val TAG = "TAG"
    }
}