package com.example.datapractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    private var db: UserProfileDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    db= Room.databaseBuilder(this, UserProfileDatabase::class.java , "userprofile").build()
    }
}