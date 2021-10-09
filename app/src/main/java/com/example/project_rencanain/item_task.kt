package com.example.project_rencanain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class item_task(
    val title_task: String,
    val date: String
) : Parcelable
