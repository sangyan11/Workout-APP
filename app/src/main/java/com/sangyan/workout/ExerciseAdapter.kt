package com.sangyan.workout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sangyan.workout.databinding.ExerciseLayoutBinding
import com.squareup.picasso.Picasso

class ExerciseAdapter(val list : List<ExercisesItem>) : RecyclerView.Adapter<ExerciseAdapter.ViewHolder>() {
 class ViewHolder(val binding : ExerciseLayoutBinding)  : RecyclerView.ViewHolder(binding.root){}

 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
   return ViewHolder(
    ExerciseLayoutBinding.inflate(
    LayoutInflater.from(parent.context)
    , parent,
     false
     ) ,
    )
 }

 override fun getItemCount(): Int {
 return list.size
 }

 override fun onBindViewHolder(holder: ViewHolder, position: Int) {
   holder.binding.exerciseName.text = list[position].name
  Picasso.get().load(list[position].gifUrl).into(holder.binding.exerciseImage)
 }


}