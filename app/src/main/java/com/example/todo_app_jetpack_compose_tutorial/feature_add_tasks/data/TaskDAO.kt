package com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDAO {

    @Insert
    suspend fun addTask(item: TaskEntity)

    @Query("SELECT * FROM TaskEntity")
    fun getTask(): Flow<List<TaskEntity>>

    @Update
    suspend fun updateTask(item: TaskEntity)

    @Delete
    suspend fun deleteTask(item: TaskEntity)
}