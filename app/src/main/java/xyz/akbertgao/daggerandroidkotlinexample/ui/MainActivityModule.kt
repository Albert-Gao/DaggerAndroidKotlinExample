package xyz.akbertgao.daggerandroidkotlinexample.ui

import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
abstract class MainActivityModule {
    
    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideABCKey(
            preference:SharedPreferences
        ):BooleanKey = BooleanKey(
            name = "abc",
            value = preference.getBoolean("abc", false)
        )

    }

}