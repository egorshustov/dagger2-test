package com.egorshustov.dagger2test

import android.util.Log
import com.egorshustov.dagger2test.MainActivity.Companion.TAG

class Tires {
    // We don't own this class so we can't annotate it with @Inject
    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}