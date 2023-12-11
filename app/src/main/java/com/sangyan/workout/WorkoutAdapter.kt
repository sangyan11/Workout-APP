package com.sangyan.workout

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.sangyan.workout.databinding.WorkoutLayoutBinding
import com.squareup.picasso.Picasso

class WorkoutAdapter(val context : Context, val workoutList  : ArrayList<Workout> ) : RecyclerView.Adapter<WorkoutAdapter.ViewHolder>() {
    class ViewHolder(val binding: WorkoutLayoutBinding) : RecyclerView.ViewHolder(binding.root) {}


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            WorkoutLayoutBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return workoutList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.workoutName.text = workoutList[position].name
        Picasso.get().load(workoutList[position].image).into(holder.binding.workoutImage)
        holder.itemView.setOnClickListener {
            when (position) {
                0-> {
                    context.startActivity(Intent(context,ExerciseActivity::class.java))
                }
                1->{
                    context.startActivity(Intent(context,BackActivity::class.java))
                }
                2 ->{
                    context.startActivity(Intent(context,LegsActivity::class.java))
                }

            }

        }


    }


}