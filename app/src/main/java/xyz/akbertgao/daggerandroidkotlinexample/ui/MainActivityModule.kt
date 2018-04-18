package xyz.akbertgao.daggerandroidkotlinexample.ui

import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun provideABCKey(
        preference:SharedPreferences
    ):BooleanKey {
        return BooleanKey(
            name = "abc",
            value = preference.getBoolean("abc", false)
        )
    }

}