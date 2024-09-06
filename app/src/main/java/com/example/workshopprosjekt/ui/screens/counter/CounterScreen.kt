package com.example.workshopprosjekt.ui.screens.counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen(modifier: Modifier = Modifier.fillMaxSize()) {

    var count by remember { mutableStateOf(0) }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "$count", fontSize = 150.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(onClick = { count = if (count == 0) 0 else count - 1 }) {
                Text(text = "-")
            }
            Button(onClick = { count++ }) {
                Text(text = "+")
            }
        }

        Button(onClick = { count = 0 }) {
            Text(text = "Reset")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun CounterScreenPreview() {
    CounterScreen()
}