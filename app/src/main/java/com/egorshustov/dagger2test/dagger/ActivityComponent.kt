package com.egorshustov.dagger2test.dagger

import com.egorshustov.dagger2test.MainActivity
import com.egorshustov.dagger2test.car.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

/** Creates and stores our objects (by creating Directed Acyclic Graph),
 * and then provides them to us. Also It can be called as "The Injector".
 * There are two ways in which the Injector can provide dependencies:
 * It can either Inject dependencies into member variables directly,
 * or use a "Provision method" which is just a simple getter method.
 * Dagger will implement this interface at compile time and creates
 * all the necessary code at the compile time (this is called an annotation processing).
 */
@PerActivity
@Subcomponent(modules = [WheelsModule::class, DieselEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    /*@Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }*/
}