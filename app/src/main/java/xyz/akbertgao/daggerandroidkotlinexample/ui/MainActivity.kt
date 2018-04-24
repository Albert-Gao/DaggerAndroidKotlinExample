package xyz.akbertgao.daggerandroidkotlinexample.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import dagger.android.support.DaggerAppCompatActivity
import xyz.akbertgao.daggerandroidkotlinexample.R
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var preferences: SharedPreferences

    @Inject
    lateinit var abcKey: BooleanKey

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Is abc in Preferences: ${preferences.contains("abc")}")
        println("value of abcKey: ${abcKey.value}")

        findViewById<TextView>(R.id.my_text_view).text = abcKey.name
    }
}
