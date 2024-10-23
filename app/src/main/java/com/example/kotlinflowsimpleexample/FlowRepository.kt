package com.example.kotlinflowsimpleexample

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FlowRepository {
    fun getItems(): Flow<List<String>> = flow {
        delay(1000)
        emit(listOf("Akash", "Ravi", "Rakesh"))
    }
}