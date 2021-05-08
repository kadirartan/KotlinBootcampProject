package com.example.kotlinbootcampprojectv11.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CurrencyDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCurrency(curr: Currency)

    @Query("SELECT * FROM currency_table ORDER BY curNo ASC")
    fun readAllData(): LiveData<List<Currency>>
}