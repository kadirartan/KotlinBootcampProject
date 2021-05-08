package com.example.kotlinbootcampprojectv11.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "spending_table")
data class Spending(
@PrimaryKey(autoGenerate = true)
val spendingNo: Int,
val userId: Int,
val curNo: Int,
val spendingDate: String,
val spendingExplain: String,
val spendingValue: Float
)
