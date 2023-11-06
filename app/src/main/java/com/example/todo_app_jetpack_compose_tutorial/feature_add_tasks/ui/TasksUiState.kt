package com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.ui

import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.ui.model.TaskModel

sealed interface TasksUiState {
    object Loading: TasksUiState
    data class Error(val throwable: Throwable): TasksUiState
    data class Success(val tasks: List<TaskModel>): TasksUiState
}