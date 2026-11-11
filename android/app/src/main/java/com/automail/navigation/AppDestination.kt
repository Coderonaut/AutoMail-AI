package com.automail.navigation

sealed class AppDestination(
    val route: String,
    val label: String,
    val symbol: String
) {

    data object Dashboard :
        AppDestination(
            "dashboard",
            "Home",
            "⌂"
        )

    data object Leads :
        AppDestination(
            "leads",
            "Leads",
            "◎"
        )

    data object History :
        AppDestination(
            "history",
            "History",
            "◷"
        )

    data object Settings :
        AppDestination(
            "settings",
            "Settings",
            "⚙"
        )

    data object Profile :
        AppDestination(
            "profile",
            "Profile",
            "●"
        )

    data object Resume :
        AppDestination(
            "resume",
            "Resume",
            "▤"
        )

}