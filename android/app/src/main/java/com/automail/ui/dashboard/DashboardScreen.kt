package com.automail.ui.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(

    onOpenLeads: () -> Unit,

    onOpenProfile: () -> Unit,

    onOpenResume: () -> Unit

) {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)

    ) {

        Text(

            text = "AutoMail AI",

            style = MaterialTheme.typography.headlineMedium

        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(

            text = "Your AI-powered emailing assistant",

            style = MaterialTheme.typography.bodyMedium,

            color = MaterialTheme.colorScheme.onSurfaceVariant

        )

        Spacer(modifier = Modifier.height(28.dp))

        Text(

            text = "Dashboard",

            style = MaterialTheme.typography.headlineSmall

        )

        Spacer(modifier = Modifier.height(16.dp))

        // Statistics

        Row(

            modifier = Modifier.fillMaxWidth(),

            horizontalArrangement = Arrangement.spacedBy(12.dp)

        ) {

            StatCard(

                title = "Total Leads",

                value = "0",

                modifier = Modifier.weight(1f)

            )

            StatCard(

                title = "Emails Sent",

                value = "0",

                modifier = Modifier.weight(1f)

            )

        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(

            modifier = Modifier.fillMaxWidth(),

            horizontalArrangement = Arrangement.spacedBy(12.dp)

        ) {

            StatCard(

                title = "Drafts",

                value = "0",

                modifier = Modifier.weight(1f)

            )

            StatCard(

                title = "Pending",

                value = "0",

                modifier = Modifier.weight(1f)

            )

        }

        Spacer(modifier = Modifier.height(28.dp))

        Text(

            text = "Quick Actions",

            style = MaterialTheme.typography.titleLarge

        )

        Spacer(modifier = Modifier.height(12.dp))

        QuickAction(

            title = "Manage Leads",

            description = "Import and manage companies",

            onClick = onOpenLeads

        )

        QuickAction(

            title = "My Profile",

            description = "Manage your sender information",

            onClick = onOpenProfile

        )

        QuickAction(

            title = "My Resume",

            description = "Manage your PDF resume",

            onClick = onOpenResume

        )

        Spacer(modifier = Modifier.height(28.dp))

        Text(

            text = "Recent Activity",

            style = MaterialTheme.typography.titleLarge

        )

        Spacer(modifier = Modifier.height(12.dp))

        Card(

            modifier = Modifier.fillMaxWidth()

        ) {

            Column(

                modifier = Modifier.padding(20.dp)

            ) {

                Text("No recent activity")

                Spacer(modifier = Modifier.height(4.dp))

                Text(

                    "Your email activity will appear here.",

                    style = MaterialTheme.typography.bodySmall

                )

            }

        }

    }

}


@Composable
private fun StatCard(

    title: String,

    value: String,

    modifier: Modifier = Modifier

) {

    Card(

        modifier = modifier,

        colors = CardDefaults.cardColors(

            containerColor =
                MaterialTheme.colorScheme.surface

        )

    ) {

        Column(

            modifier = Modifier.padding(18.dp)

        ) {

            Text(

                text = value,

                style = MaterialTheme.typography.headlineMedium

            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(

                text = title,

                style = MaterialTheme.typography.bodyMedium

            )

        }

    }

}


@Composable
private fun QuickAction(

    title: String,

    description: String,

    onClick: () -> Unit

) {

    Card(

        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),

        onClick = onClick

    ) {

        Column(

            modifier = Modifier.padding(16.dp)

        ) {

            Text(

                text = title,

                style = MaterialTheme.typography.titleMedium

            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(

                text = description,

                style = MaterialTheme.typography.bodySmall

            )

        }

    }

}