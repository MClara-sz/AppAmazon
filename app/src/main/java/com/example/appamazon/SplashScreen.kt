package com.example.appamazon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


            Handler().postDelayed(

                {
                    val i : Intent = Intent(this, MainActivity::class.java)
                    startActivity(i)

                    finish()
                }, 5* 1000
            )
    }
}