package xyz.akbertgao.daggerandroidkotlinexample.app

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import xyz.akbertgao.daggerandroidkotlinexample.ui.MainActivityModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModuleForTest::class,
        ActivitiesBindingModuleForTest::class
    ]
)
interface AppComponentForTest: AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        fun appModuleForTest(appModuleForTest: AppModuleForTest):Builder

        @BindsInstance
        fun create(app: Application):Builder

        fun build(): AppComponentForTest
    }
}