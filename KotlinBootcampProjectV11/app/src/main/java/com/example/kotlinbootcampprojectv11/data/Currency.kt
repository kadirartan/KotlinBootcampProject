package com.example.kotlinbootcampprojectv11.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currency_table")
data class Currency(
    @PrimaryKey(autoGenerate = true)
    val curNo: Int,
    val curType: String,
    val curDate: String,
    val curValue: String
)