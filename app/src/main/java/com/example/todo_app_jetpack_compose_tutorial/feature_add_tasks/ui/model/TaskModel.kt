package com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.ui.model

data class TaskModel(
    val id: Int = System.currentTimeMillis().hashCode(),
    val task: String,
    var selected: Boolean = false
)
