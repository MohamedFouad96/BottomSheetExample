package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton: Button = findViewById(R.id.button)

        showButton.setOnClickListener {
            val bottomSheet = ItemListDialogFragment()
            bottomSheet.show(supportFragmentManager,"")
        }
    }
}