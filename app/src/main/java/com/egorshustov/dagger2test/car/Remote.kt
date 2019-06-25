package com.egorshustov.dagger2test.car

import android.util.Log
import com.egorshustov.dagger2test.MainActivity.Companion.TAG
import javax.inject.Inject

class Remote @Inject constructor() {
    fun setListener(car: Car) {
        Log.d(TAG, "Remote: setListener($car)")
    }
}