package com.example.paynova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.paynova.ui.navigation.AppNavigation
import com.example.paynova.theme.PayNovaTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PayNovaTheme {
                Surface(
                    modifier = Modifier
                ) {
                    AppNavigation()
                }
            }
        }
    }
}