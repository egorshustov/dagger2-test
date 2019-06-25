package com.egorshustov.dagger2test.car

import android.util.Log
import com.egorshustov.dagger2test.MainActivity.Companion.TAG
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "Diesel Engine Started")
    }
}