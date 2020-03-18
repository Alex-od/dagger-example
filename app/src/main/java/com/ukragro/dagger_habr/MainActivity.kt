package com.ukragro.dagger_habr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ukragro.dagger_habr.component.DaggerMyComponent
import com.ukragro.dagger_habr.component.MyComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start()
    }


    fun start(){
        val car:Car = DaggerMyComponent.create().getCar()
        Log.d("qwer","car is $car")
    }
}
