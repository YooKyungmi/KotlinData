package com.example.datapractice

import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserProfileDao {
    @Query("SELECT * FROM")
    fun getAll(): List<UserProfile>
    fun deleteAlarm(userProfile: UserProfile)
    fun insertAlarm(userProfile: UserProfile)
    fun updateAlarm(userProfile: UserProfile)
}