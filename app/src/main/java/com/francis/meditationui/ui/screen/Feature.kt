package com.francis.meditationui.ui.screen

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
