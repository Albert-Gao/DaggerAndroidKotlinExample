package xyz.akbertgao.daggerandroidkotlinexample

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.filters.SmallTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule
import org.mockito.Mock
import org.mockito.Mockito.*
import xyz.akbertgao.daggerandroidkotlinexample.ui.BooleanKey
import xyz.akbertgao.daggerandroidkotlinexample.ui.MainActivity

@SmallTest
@RunWith(AndroidJUnit4::class)
class DemoInstrumentedTest {

    @Rule
    @JvmField
    var rule = espressoDaggerMockRule()

    @Rule
    @JvmField
    val mainActivityRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Mock
    private lateinit var mockBooleanKey: BooleanKey


    @Test
    fun it_should_show_name_from_mock_object() {
        `when`(mockBooleanKey.name).thenReturn("albert")

        mainActivityRule.launchActivity(null)

        onView(withId(R.id.my_text_view)).check(matches(ViewMatchers.withText("albert")))
    }
}
