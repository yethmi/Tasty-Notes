package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
    }
    fun openProfile(view: View) {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
    fun openAddRecipe(view: View) {
        val intent = Intent(this, AddRecipe::class.java)
        startActivity(intent)
    }
    fun openDashboard(view: View) {
        val intent = Intent(this, Dashboard::class.java)
        startActivity(intent)
    }
    fun openFavourite(view: View) {
        val intent = Intent(this, Favourites::class.java)
        startActivity(intent)
    }
}