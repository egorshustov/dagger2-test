package com.egorshustov.dagger2test

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels
) {
    fun drive() {
        Log.d(TAG, "driving...")
    }

    companion object {
        const val TAG = "Car"
    }
}