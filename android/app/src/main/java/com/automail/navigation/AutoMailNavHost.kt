package com.automail.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*

import com.automail.ui.dashboard.DashboardScreen
import com.automail.ui.leads.LeadsScreen
import com.automail.ui.history.HistoryScreen
import com.automail.ui.settings.SettingsScreen
import com.automail.ui.profile.ProfileScreen
import com.automail.ui.resume.ResumeScreen

@Composable
fun AutoMailNavHost() {

    val navController = rememberNavController()

    val bottomDestinations = listOf(

        AppDestination.Dashboard,

        AppDestination.Leads,

        AppDestination.History,

        AppDestination.Settings

    )

    val navBackStackEntry by
        navController.currentBackStackEntryAsState()

    val currentRoute =
        navBackStackEntry?.destination?.route

    Scaffold(

        bottomBar = {

            NavigationBar {

                bottomDestinations.forEach { destination ->

                    NavigationBarItem(

                        selected =
                            currentRoute == destination.route,

                        onClick = {

                            navController.navigate(destination.route) {

                                popUpTo(
                                    navController.graph.startDestinationId
                                ) {
                                    saveState = true
                                }

                                launchSingleTop = true

                                restoreState = true

                            }

                        },

                        icon = {

                            Text(destination.symbol)

                        },

                        label = {

                            Text(destination.label)

                        }

                    )

                }

            }

        }

    ) { innerPadding ->

        NavHost(

            navController = navController,

            startDestination =
                AppDestination.Dashboard.route,

            modifier = Modifier.padding(innerPadding)

        ) {

            composable(AppDestination.Dashboard.route) {

                DashboardScreen(

                    onOpenLeads = {

                        navController.navigate(
                            AppDestination.Leads.route
                        )

                    },

                    onOpenProfile = {

                        navController.navigate(
                            AppDestination.Profile.route
                        )

                    },

                    onOpenResume = {

                        navController.navigate(
                            AppDestination.Resume.route
                        )

                    }

                )

            }

            composable(AppDestination.Leads.route) {

                LeadsScreen()

            }

            composable(AppDestination.History.route) {

                HistoryScreen()

            }

            composable(AppDestination.Settings.route) {

                SettingsScreen()

            }

            composable(AppDestination.Profile.route) {

                ProfileScreen()

            }

            composable(AppDestination.Resume.route) {

                ResumeScreen()

            }

        }

    }

}