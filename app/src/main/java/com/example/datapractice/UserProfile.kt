package com.example.datapractice

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserProfile (
    @PrimaryKey(autoGenerate = true)
    val ampm: Boolean = false,
    val time: String = "",
    val date: String = "",
    val power: Boolean = true

    )