package com.example.kotlinbootcampprojectv11.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SpendingDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addSpending(spending: Spending)

    @Query("SELECT * FROM spending_table ORDER BY spendingNo ASC")
    fun readAllData(): LiveData<List<Spending>>
}