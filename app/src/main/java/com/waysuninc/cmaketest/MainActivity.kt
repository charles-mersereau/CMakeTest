package com.waysuninc.cmaketest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    companion object {
        init {
            System.loadLibrary("chewy-lib")
        }
    }

}
