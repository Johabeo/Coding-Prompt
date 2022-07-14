package com.example.myapplication.data.repo

import com.example.myapplication.data.api.StudentApi

class StudentRepo(val inter : StudentApi) {
    suspend fun getAllStudents() = inter.getAllStudents()
}