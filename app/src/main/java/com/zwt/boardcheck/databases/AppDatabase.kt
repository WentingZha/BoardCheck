package com.zwt.boardcheck.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zwt.boardcheck.data.local.TopEntity
import com.zwt.boardcheck.data.TopItem

@Database(entities = [TopEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun TopDAO(): TopDAO
}