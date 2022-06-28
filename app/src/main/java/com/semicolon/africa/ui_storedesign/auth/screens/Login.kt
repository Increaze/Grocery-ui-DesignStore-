package com.semicolon.africa.ui_storedesign.auth.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.semicolon.africa.ui_storedesign.navigation.destinations.Destination

@Composable
fun Login(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login")

        TextButton(onClick = {
            navController.navigate(Destination.SignupDestination.route)
        }) {
            Text(text = "Go to register")
        }
    }
}