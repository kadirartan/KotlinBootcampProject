package com.example.kotlinbootcampprojectv11.data

import androidx.lifecycle.LiveData

class SpendingRepository(private val spendingDao: SpendingDao) {
    val readAllData: LiveData<List<Spending>> = spendingDao.readAllData()

    suspend fun addSpending(spending: Spending){
        spendingDao.addSpending(spending)
    }
}