package xyz.akbertgao.daggerandroidkotlinexample.app

import dagger.Module
import dagger.android.ContributesAndroidInjector
import xyz.akbertgao.daggerandroidkotlinexample.ui.MainActivity
import xyz.akbertgao.daggerandroidkotlinexample.ui.MainActivityModule

@Module
abstract class ActivitiesBindingModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity

}