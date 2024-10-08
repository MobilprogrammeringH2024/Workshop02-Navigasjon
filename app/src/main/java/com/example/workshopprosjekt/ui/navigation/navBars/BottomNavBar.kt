package com.example.workshopprosjekt.ui.navigation.navBars

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.workshopprosjekt.R
import com.example.workshopprosjekt.ui.navigation.AppScreens


data class BottomNavItems(val route: AppScreens, val icon: ImageVector, @StringRes val label: Int)

val shortcuts = listOf(
    BottomNavItems(AppScreens.HOME, Icons.Default.Home, R.string.home),
    BottomNavItems(AppScreens.COUNTER, Icons.Default.AddCircle, R.string.counter)
)

@Composable
fun BottomNavBar(navController: NavController) {

    NavigationBar () {
        shortcuts.forEach { shortcut ->
            NavigationBarItem(
                icon = { Icon(shortcut.icon, contentDescription = stringResource(shortcut.label)) },
                label = { Text(stringResource(shortcut.label)) },
                selected = getCurrentScreen(navController) == shortcut.route.name,
                onClick = { navController.navigate(shortcut.route.name) }
            )
        }
    }

}

@Composable
fun getCurrentScreen(navController: NavController): String {
    return navController.currentBackStackEntryAsState().value?.destination?.route.toString()
}

@Preview
@Composable
fun BottomNavBarPreview() {
    BottomNavBar(rememberNavController())
}
