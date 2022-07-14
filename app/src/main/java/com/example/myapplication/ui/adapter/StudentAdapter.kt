package com.example.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.model.Student

class StudentAdapter(val students : List<Student> ): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return students.size
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.rvname.text = "Name: ${students.get(position).studentName} "
        holder.rvage.text = "Age: ${students.get(position).studentAge} "
        holder.rvroll.text = "Roll: ${students.get(position).studentRollNumber} "
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_card, parent, false)

        return ViewHolder(view)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val rvname: TextView = view.findViewById(R.id.rvname)
        val rvage: TextView = view.findViewById(R.id.rvage)
        val rvroll: TextView = view.findViewById(R.id.rvroll)
    }
}

