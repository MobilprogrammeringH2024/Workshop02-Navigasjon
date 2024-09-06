package com.example.workshopprosjekt.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.workshopprosjekt.R
import com.example.workshopprosjekt.ui.navigation.AppScreens

@Composable
fun HomeScreen(navController: NavController) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate(AppScreens.IMAGE.name) },
            modifier = Modifier
        ) {
            Text(text = stringResource(R.string.see_image))
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}