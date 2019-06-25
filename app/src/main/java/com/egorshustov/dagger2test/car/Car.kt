package com.egorshustov.dagger2test.car

import android.util.Log
import com.egorshustov.dagger2test.MainActivity.Companion.TAG
import javax.inject.Inject

data class Car @Inject constructor(
    val wheels: Wheels,
    val engine: Engine
) {
    fun drive() {
        engine.start()
        Log.d(TAG, "Car: drive()")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}