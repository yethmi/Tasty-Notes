package layout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.labexam2.AddRecipe
import com.example.labexam2.Dashboard
import com.example.labexam2.Desserts
import com.example.labexam2.Favourites
import com.example.labexam2.R


class NavigationBar {

    class Dashboard : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_dashboard)
        }

        fun openAddRecipe(view: View) {
            val intent = Intent(this, AddRecipe::class.java)
            startActivity(intent)
        }

        fun openFavourite(view: View) {
            val intent = Intent(this, Favourites::class.java)
            startActivity(intent)
        }

        fun openDashboard(view: View) {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}