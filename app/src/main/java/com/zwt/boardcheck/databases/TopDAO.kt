package com.zwt.boardcheck.databases

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.zwt.boardcheck.data.local.TopEntity

@Dao
interface TopDAO {
    @Query("SELECT * FROM TopEntity")
    fun getAll(): List<TopEntity>

    @Insert
    fun insertAll(vararg topItems: TopEntity)
}