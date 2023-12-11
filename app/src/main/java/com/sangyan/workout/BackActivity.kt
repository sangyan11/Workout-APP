package com.sangyan.workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.sangyan.workout.databinding.ActivityBackBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BackActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("https://exercisedb.p.rapidapi.com/exercises/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WorkoutAPI::class.java)

        val retrofitData = retrofitBuilder.getBackExercises()
        retrofitData.enqueue(object : Callback<Exercises> {
            override fun onResponse(call: Call<Exercises>, response: Response<Exercises>) {
                binding.rvBackWorkout.layoutManager = LinearLayoutManager(this@BackActivity)
                binding.rvBackWorkout.adapter = ExerciseAdapter(response.body()!!)
            }

            override fun onFailure(call: Call<Exercises>, t: Throwable) {
                Log.d("TAG", "onFailure: $t")
            }

        })
    }
}