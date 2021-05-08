package com.example.kotlinbootcampprojectv11.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

abstract class SpendingViewModel(application: Application): AndroidViewModel(application) {

    private val readAllData: LiveData<List<Spending>>
    private val repository: SpendingRepository

    init {
        val spendingDao = SpendingDatabase.getDatabase(application).spendingDao()
        repository = SpendingRepository(spendingDao)
        readAllData = repository.readAllData
    }

    fun addSpending(spending: Spending){
        viewModelScope.launch(Dispatchers.IO){
            repository.addSpending(spending)
        }
    }
}