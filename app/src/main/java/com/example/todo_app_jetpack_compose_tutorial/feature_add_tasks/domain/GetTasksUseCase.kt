package com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.domain

import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.data.TaskRepository
import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}