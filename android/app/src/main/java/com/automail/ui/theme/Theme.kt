package com.automail.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val AutoMailColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = Surface,
    primaryContainer = PrimaryDark,
    background = Background,
    surface = Surface,
    onSurface = TextPrimary
)

@Composable
fun AutoMailTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AutoMailColorScheme,
        content = content
    )
}