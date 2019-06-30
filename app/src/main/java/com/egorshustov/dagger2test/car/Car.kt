package com.egorshustov.dagger2test.car

import android.util.Log
import com.egorshustov.dagger2test.MainActivity.Companion.TAG
import javax.inject.Inject

data class Car @Inject constructor(
    val driver: Driver,
    val wheels: Wheels,
    val engine: Engine
) {
    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}