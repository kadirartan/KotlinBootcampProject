package com.example.kotlinbootcampprojectv11.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities= [Spending::class], version = 1, exportSchema = false)

abstract class SpendingDatabase: RoomDatabase() {

    abstract fun spendingDao(): SpendingDao

    companion object {
        private var INSTANCE: SpendingDatabase? = null

        fun getDatabase(context: Context): SpendingDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SpendingDatabase::class.java,
                    "spending_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}