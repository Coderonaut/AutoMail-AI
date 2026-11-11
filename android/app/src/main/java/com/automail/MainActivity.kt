package com.automail

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.automail.navigation.AutoMailNavHost
import com.automail.ui.theme.AutoMailTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            AutoMailTheme {

                AutoMailNavHost()

            }

        }

    }

}