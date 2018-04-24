package xyz.akbertgao.daggerandroidkotlinexample

import android.support.test.InstrumentationRegistry
import it.cosenonjaviste.daggermock.DaggerMock
import xyz.akbertgao.daggerandroidkotlinexample.app.App
import xyz.akbertgao.daggerandroidkotlinexample.app.AppComponentForTest
import xyz.akbertgao.daggerandroidkotlinexample.app.AppModuleForTest

fun espressoDaggerMockRule() = DaggerMock.rule<AppComponentForTest>(AppModuleForTest()) {
    set { component -> component.inject(app) }
    customizeBuilder<AppComponentForTest.Builder> { it.create(app) }
}

val app: App
    get() = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as App