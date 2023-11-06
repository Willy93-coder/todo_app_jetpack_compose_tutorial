package com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = TaskEntity.TABLE_NAME)
data class TaskEntity(
    @PrimaryKey
    val id: Int,

    val task: String,
    var selected: Boolean
) {
    companion object {
        const val TABLE_NAME = "TaskEntity"
    }
}
