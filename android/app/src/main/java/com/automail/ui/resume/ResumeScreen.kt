package com.automail.ui.resume

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ResumeScreen() {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)

    ) {

        Text(

            text = "My Resume",

            style = MaterialTheme.typography.headlineMedium

        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(

            onClick = {
                // PDF picker will be implemented later.
            }

        ) {

            Text("Select PDF Resume")

        }

        Spacer(modifier = Modifier.height(12.dp))

        Text("No resume selected")

    }

}