package com.example.project_rencanain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val rencanainlist = listOf<item_task>(
            item_task("Movie Date", "Today, 18.00"),
            item_task("Midterm Exam" , "08.00"),
            item_task("Jogging", "Sunday, 10.00")

        )
    }
}
