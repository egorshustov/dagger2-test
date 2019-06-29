package com.egorshustov.dagger2test.car

import android.util.Log
import com.egorshustov.dagger2test.MainActivity.Companion.TAG
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse power") private val horsePower: Int,
    @Named("engine capacity") private val engineCapacity: Int
) : Engine {
    override fun start() {
        Log.d(TAG, "Petrol Engine started. \nHorsePower: $horsePower \nEngineCapacity: $engineCapacity")
    }
}