package com.example.myapplication.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.repo.StudentRepo

class StudentViewModel(val repo : StudentRepo) : ViewModel() {
    //json error handling takes place here
    suspend fun getAllStudents() = repo.getAllStudents()
}