package com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.data.di

import android.content.Context
import androidx.room.Room
import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.data.TaskDAO
import com.example.todo_app_jetpack_compose_tutorial.feature_add_tasks.data.TodoDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Provides
    fun provideTaskDao(todoDataBase: TodoDataBase): TaskDAO {
        return todoDataBase.taskDAO()
    }

    @Provides
    @Singleton
    fun provideTodoDataBase(@ApplicationContext appContext: Context): TodoDataBase {
        return Room.databaseBuilder(appContext, TodoDataBase::class.java, "TaskDataBase").build()
    }
}