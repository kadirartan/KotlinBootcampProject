package com.example.kotlinbootcampprojectv11.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val userId: Int,
    val firstName: String,
    val lastName: String,
    val gender: String
)