package com.e.demogit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val userPost = "Executive"
        when(userPost){
            "Executive" -> {
                println("user is executive")
            }

            "Sale Executive" -> {
                println("user is executive")
            }
            else -> {
                println("This is not user executive")
            }
        }
    }
}