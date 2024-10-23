package com.example.kotlinflowsimpleexample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FlowScreen(
      viewModel: FlowViewModel = viewModel()
) {
    val items = viewModel.items.collectAsState()


    Column(modifier = Modifier.padding(4.dp)){
        Button(onClick = { viewModel.fetchItems() }) {
           Text("Fetch items")
        }
    }
    Spacer(modifier = Modifier.padding(8.dp))

    items.value.forEach { item->
        Text( text = item)
    }
}