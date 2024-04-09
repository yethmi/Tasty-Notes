package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnBordingScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_bording_screen_1)
    }

    fun openOnBoard2(view: View) {
        val intent = Intent(this, OnBordingScreen2::class.java)
        startActivity(intent)
    }
}