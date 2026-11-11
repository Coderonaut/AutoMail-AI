package com.automail.ui.settings

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)

    ) {

        Text(

            text = "Settings",

            style = MaterialTheme.typography.headlineMedium

        )

        Spacer(modifier = Modifier.height(24.dp))

        ListItem(

            headlineContent = {
                Text("Gemini AI")
            },

            supportingContent = {
                Text("AI configuration")
            }

        )

        HorizontalDivider()

        ListItem(

            headlineContent = {
                Text("Gmail Account")
            },

            supportingContent = {
                Text("Email account connection")
            }

        )

        HorizontalDivider()

        ListItem(

            headlineContent = {
                Text("About AutoMail AI")
            },

            supportingContent = {
                Text("Application information")
            }

        )

    }

}