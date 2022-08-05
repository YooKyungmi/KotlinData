package com.example.datapractice

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserProfile  (
    @PrimaryKey(autoGenerate = true)
    var ampm: Boolean = false,
    var time: String = "",
    var date: String = "",
    var power: Boolean = true

    )