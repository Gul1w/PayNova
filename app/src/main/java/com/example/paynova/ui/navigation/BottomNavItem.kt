package com.example.paynova.ui.navigation

sealed class BottomNavItem(
    val route: String,
    val title: String
) {

    object Dashboard : BottomNavItem(
        "dashboard",
        "Bosh sahifa"
    )

    object Cards : BottomNavItem(
        "cards",
        "Kartalar"
    )

    object Ai : BottomNavItem(
        "ai",
        "Himoya"
    )

    object Notifications : BottomNavItem(
        "notifications",
        "Bildirishnomalar"
    )

    object Profile : BottomNavItem(
        "profile",
        "Profil"
    )

}