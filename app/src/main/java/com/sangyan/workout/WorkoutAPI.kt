package com.sangyan.workout

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WorkoutAPI {



    @Headers("X-RapidAPI-Key: 46148b4864mshc938641926e4e4ep14c245jsn4bb8d9d30101" ,
            "X-RapidAPI-Host: exercisedb.p.rapidapi.com"
    )
    @GET("/exercises/bodyPart/chest")
    fun getChestExercises(
        @Query("limit") limit: Int = 20
    ) : Call<Exercises>


    @Headers("X-RapidAPI-Key: 46148b4864mshc938641926e4e4ep14c245jsn4bb8d9d30101" ,
        "X-RapidAPI-Host: exercisedb.p.rapidapi.com"
    )
    @GET("/exercises/bodyPart/back")
    fun getBackExercises(
        @Query("limit") limit: Int = 20
    ) : Call<Exercises>

    @Headers("X-RapidAPI-Key: 46148b4864mshc938641926e4e4ep14c245jsn4bb8d9d30101" ,
        "X-RapidAPI-Host: exercisedb.p.rapidapi.com"
    )
    @GET("/exercises/bodyPart/shoulders")
    fun getLegsExercises(
        @Query("limit") limit: Int = 10
    ) : Call<Exercises>

}