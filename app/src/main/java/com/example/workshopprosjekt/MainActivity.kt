package com.example.workshopprosjekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.workshopprosjekt.ui.navigation.AppNavigation
import com.example.workshopprosjekt.ui.theme.WorkshopProsjektTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkshopProsjektTheme {
                AppNavigation()
            }
        }
    }
}

