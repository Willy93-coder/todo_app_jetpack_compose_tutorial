package com.example.todo_app_jetpack_compose_tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.ui.TasksViewModel
import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.ui.TasksScreen
import com.example.todo_app_jetpack_compose_tutorial.ui.theme.Todo_app_jetpack_compose_tutorialTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val tasksViewModel: TasksViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Todo_app_jetpack_compose_tutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TasksScreen(tasksViewModel)
                }
            }
        }
    }
}
