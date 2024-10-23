package com.example.kotlinflowsimpleexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FlowViewModel(
    private val flowRepository : FlowRepository
): ViewModel() {

     private val _items = MutableStateFlow<List<String>>(emptyList())
    val items = _items.asStateFlow()

    fun fetchItems(){
         viewModelScope.launch {
             flowRepository.getItems().collect{ itemList ->
                 _items.value = itemList
             }
         }
    }
}