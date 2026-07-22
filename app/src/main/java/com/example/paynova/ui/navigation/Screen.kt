package com.example.paynova.ui.navigation

sealed class Screen(val route: String) {

    object Splash : Screen("splash")
    object Onboarding : Screen("onboarding")
    object Login : Screen("login")
    object Dashboard : Screen("dashboard")

    object Cards : Screen("cards")
    object AiShield : Screen("aishield")
    object Payment : Screen("payment")
    object QRScanner : Screen("qrscanner")
    object Monitoring : Screen("monitoring")
    object Notifications : Screen("notifications")
    object Analytics : Screen("analytics")
    object Profile : Screen("profile")
    object Settings : Screen("settings")
}