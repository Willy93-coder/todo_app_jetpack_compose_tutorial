package com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.domain

import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.data.TaskRepository
import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.ui.model.TaskModel
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.delete(taskModel)
    }
}