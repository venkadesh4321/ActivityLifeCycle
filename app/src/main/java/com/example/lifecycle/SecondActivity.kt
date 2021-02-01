package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.e("ssss===>", "onCreate B" )
        val btn : Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("ssss===>", "onStart B" )
    }


    override fun onResume() {
        super.onResume()
        Log.e("ssss===>", "onResume B" )
    }

    override fun onPause() {
        super.onPause()
        Log.e("ssss===>", "onPause B" )
    }

    override fun onStop() {
        super.onStop()
        Log.e("ssss===>", "onStop B" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ssss===>", "onDestroy B" )
    }
}