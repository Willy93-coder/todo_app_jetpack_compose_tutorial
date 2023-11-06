package com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TodoDataBase: RoomDatabase() {
    abstract fun taskDAO(): TaskDAO
}