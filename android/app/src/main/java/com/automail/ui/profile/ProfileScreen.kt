package com.automail.ui.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)

    ) {

        Text(

            text = "My Profile",

            style = MaterialTheme.typography.headlineMedium

        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Your sender information will appear here.")

    }

}