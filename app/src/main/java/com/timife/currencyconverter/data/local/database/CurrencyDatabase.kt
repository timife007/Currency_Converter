package com.timife.currencyconverter.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.timife.currencyconverter.data.local.daos.CurrencyDao

//@Database(
//    entities = [CurrencyEntity::class],
//    version = 1,
//    exportSchema = false
//)
abstract class CurrencyDatabase : RoomDatabase() {
    abstract val currencyDao: CurrencyDao
}