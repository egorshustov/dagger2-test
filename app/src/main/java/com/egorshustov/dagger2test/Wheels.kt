package com.egorshustov.dagger2test

// We don't own this class so we can't annotate it with @Inject
data class Wheels(
    val rims: Rims,
    val tires: Tires
)