package com.sangyan.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangyan.workout.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cvTryNow.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        binding.cvLogin.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}