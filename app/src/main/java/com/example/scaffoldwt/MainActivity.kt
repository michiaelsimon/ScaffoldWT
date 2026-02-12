package com.example.scaffoldwt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.scaffoldwt.ui.screens.ScaffoldApp
import com.example.scaffoldwt.ui.theme.ScaffoldWTTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldWTTheme{
                ScaffoldApp()
            }
        }
    }
}