package com.egorshustov.dagger2test.car

import android.util.Log
import com.egorshustov.dagger2test.MainActivity.Companion.TAG

class DieselEngine(private val horsePower: Int) : Engine {
    override fun start() {
        Log.d(TAG, "Diesel Engine Started. HorsePower: $horsePower")
    }
}