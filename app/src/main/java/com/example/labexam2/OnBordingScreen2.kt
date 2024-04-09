package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnBordingScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_bording_screen_2)
    }

    fun openOnBoard3(view: View) {
        val intent = Intent(this,OnBordingScreen3::class.java)
        startActivity(intent)
    }
}