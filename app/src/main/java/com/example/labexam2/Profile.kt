package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun openEditProfile(view: View) {
        val intent = Intent(this, EditProfile::class.java)
        startActivity(intent)
    }

    fun openDashboard(view: View) {}
}