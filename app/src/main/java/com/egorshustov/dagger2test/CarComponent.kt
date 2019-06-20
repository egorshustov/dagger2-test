package com.egorshustov.dagger2test

import dagger.Component

/** Creates and stores our objects (by creating Directed Acyclic Graph),
 * and then provides them to us. Also It can be called as "The Injector".
 * There are two ways in which the Injector can provide dependencies:
 * It can either Inject dependencies into member variables directly,
 * or use a "Provision method" which is just a simple getter method.
 * Dagger will implement this interface at compile time and creates
 * all the necessary code at the compile time (this is called an annotation processing).
 */
@Component
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}