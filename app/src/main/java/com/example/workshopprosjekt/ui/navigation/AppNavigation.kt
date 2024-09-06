package com.example.workshopprosjekt.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.workshopprosjekt.ui.navigation.navBars.BottomNavBar
import com.example.workshopprosjekt.ui.navigation.navBars.TopBar
import com.example.workshopprosjekt.ui.navigation.navBars.getCurrentScreen
import com.example.workshopprosjekt.ui.screens.counter.CounterScreen
import com.example.workshopprosjekt.ui.screens.home.HomeScreen
import com.example.workshopprosjekt.ui.screens.image.ImageScreen


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val currentScreen = getCurrentScreen(navController)

    Scaffold(
        topBar = {
            when(currentScreen) {
                AppScreens.IMAGE.name -> { TopBar(navController, route = AppScreens.HOME.name) }
                else -> TopBar(navController)
            }
        },
        bottomBar = {
            when(currentScreen) {
                AppScreens.IMAGE.name -> {  }
                else -> BottomNavBar(navController)
            }
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = AppScreens.HOME.name,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(AppScreens.COUNTER.name) {
                CounterScreen()
            }

            composable(AppScreens.HOME.name) {
                HomeScreen(navController)
            }

            composable(AppScreens.IMAGE.name) {
                ImageScreen()
            }

        }

    }
}
