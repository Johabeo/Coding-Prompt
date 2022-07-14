package com.example.myapplication.data.api

import com.example.myapplication.data.model.Student
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// Question 3
interface StudentApi {
    @GET("/v1/abb92e67-c508-4b16-bdb2-0573b53cd364")
    suspend fun getAllStudents() : Response<List<Student>>

    companion object {
        private const val BASE_URL = "https://mocki.io/"
        fun create() : StudentApi {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(StudentApi::class.java)
        }
    }
}