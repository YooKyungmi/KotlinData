package com.example.datapractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.room.Room
import com.example.datapractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var db: UserProfileDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db= Room.databaseBuilder(this, UserProfileDatabase::class.java , "userprofile").build()

    }
    private fun addUserProfile(view: View){



    }

    override fun onClick(p0: View?) {
        when(p0){
            binding.button->{
               var userProfile = UserProfile()
                userProfile.power=binding.onoffSwitch.isChecked
                userProfile.ampm=binding.ampm.isChecked
                userProfile.time=binding.time.text.toString()
                userProfile.date=binding.date.text.toString()
                db?.getDao()?.insertAlarm(userProfile)
            }
        }
    }
}