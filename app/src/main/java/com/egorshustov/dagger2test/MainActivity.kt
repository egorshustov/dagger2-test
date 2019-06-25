package com.egorshustov.dagger2test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.egorshustov.dagger2test.car.Car
import com.egorshustov.dagger2test.dagger.DaggerCarComponent
import com.egorshustov.dagger2test.dagger.DieselEngineModule
import com.egorshustov.dagger2test.dagger.WheelsModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()
        carComponent.inject(this@MainActivity)

        car.drive()
    }

    companion object {
        const val TAG = "TAG"
    }
}