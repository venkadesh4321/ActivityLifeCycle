package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("ssss===>", "onCreate A" )
        val btn : Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("ssss===>", "onStart A")
    }


    override fun onResume() {
        super.onResume()
        Log.e("ssss===>", "onResume A")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ssss===>", "onPause A")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ssss===>", "onStop A" )
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ssss===>", "onRestart A" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ssss===>", "onDestroy A" )
    }
}