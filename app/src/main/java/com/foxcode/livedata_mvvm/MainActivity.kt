package com.foxcode.livedata_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = BlankFragment1()
        val fragment2 = BlankFragment2()

        supportFragmentManager.beginTransaction().apply {
            add(R.id.FrameLayout_container1, fragment1)
            add(R.id.FrameLayout_container2, fragment2)
            commit()
        }




    }
}