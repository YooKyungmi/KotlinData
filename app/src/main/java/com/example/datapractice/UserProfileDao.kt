package com.example.datapractice

import androidx.room.*

@Dao
interface UserProfileDao {
    @Query("SELECT * FROM UserProfile")  //목록 불러오기
    fun getAll(): List<UserProfile>
    @Delete  //삭제
    fun deleteAlarm(userProfile: UserProfile)
    @Insert   //삽입
    fun insertAlarm(userProfile: UserProfile)
    @Update   //수정
    fun updateAlarm(userProfile: UserProfile)
}