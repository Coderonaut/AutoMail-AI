package com.automail.ui.leads

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LeadsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Your Leads",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = "No leads added yet.")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { }) {
            Text("Import CSV")
        }
    }
}