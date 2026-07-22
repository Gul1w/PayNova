package com.example.paynova.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.paynova.ui.screens.*

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

        composable(Screen.Splash.route) {
            SplashScreen()
        }

        composable(Screen.Onboarding.route) {
            OnboardingScreen()
        }

        composable(Screen.Login.route) {
            LoginScreen()
        }

        composable(Screen.Dashboard.route) {
            DashboardScreen()
        }

        composable(Screen.Cards.route) {
            CardsScreen()
        }

        composable(Screen.AiShield.route) {
            AiShieldScreen()
        }

        composable(Screen.Payment.route) {
            PaymentScreen()
        }

        composable(Screen.QRScanner.route) {
            QRScannerScreen()
        }

        composable(Screen.Monitoring.route) {
            MonitoringScreen()
        }

        composable(Screen.Notifications.route) {
            NotificationsScreen()
        }

        composable(Screen.Analytics.route) {
            AnalyticsScreen()
        }

        composable(Screen.Profile.route) {
            ProfileScreen()
        }

        composable(Screen.Settings.route) {
            SettingsScreen()
        }

    }

}