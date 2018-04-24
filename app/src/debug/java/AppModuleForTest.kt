package xyz.akbertgao.daggerandroidkotlinexample.app

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import xyz.akbertgao.daggerandroidkotlinexample.ui.BooleanKey
import xyz.akbertgao.daggerandroidkotlinexample.ui.MainActivityModule
import javax.inject.Singleton

@Module
class AppModuleForTest {
    @Provides
    @Singleton
    fun provideSharedPreference(app: Application): SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(app)

    @Provides
    fun provideABCKey(
        preference:SharedPreferences
    ): BooleanKey = BooleanKey(
        name = "abc",
        value = preference.getBoolean("abc", false)
    )
}