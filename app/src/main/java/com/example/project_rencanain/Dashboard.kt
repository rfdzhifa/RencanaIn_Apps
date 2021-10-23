package com.example.project_rencanain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val FragmentHome = FragmentHome()
        val Fragmentcalendar = FragmentCalendar()
        val FragmentNotification = FragmentNotification()

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottomnav)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home -> makeCurrentFragment(FragmentHome)
                R.id.calendar -> makeCurrentFragment(Fragmentcalendar)
                R.id.notification -> makeCurrentFragment(FragmentNotification)
            }
            true
        }

        makeCurrentFragment (FragmentHome)

        val rencanain = listOf<item_task>(
            item_task(
                "Midterm Exam",
                "Today, 24.00 - 16.00"
            ),
            item_task(
                "Cleaning the House",
                "Today, 20.00"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.tasklist)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}
