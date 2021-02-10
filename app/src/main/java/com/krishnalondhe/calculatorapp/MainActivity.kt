package com.krishnalondhe.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAdd.setOnClickListener {
            val var1= etVar1.text.toString().toInt()
            val var2= etVar2.text.toString().toInt()

            val sum= (var1 + var2).toString()
            tvResult.text = sum
        }
    }
}