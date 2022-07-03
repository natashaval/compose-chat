package com.natashaval.composechat.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
  primary = Purple200,
  primaryVariant = Purple700,
  secondary = Teal200
)

private val LightColorPalette = lightColors(
  primary = Purple500,
  primaryVariant = Purple700,
  secondary = Teal200
)

private val BasicsDarkColorPalette = darkColors(
  surface = Blue,
  onSurface = Navy,
  primary = Navy,
  onPrimary = Chartreuse
)

private val BasicsLightColorPalette = lightColors(
  surface = Blue,
  onSurface = Color.White,
  primary = LightBlue,
  onPrimary = Navy
)

@Composable
fun ComposeChatTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
  val colors = if (darkTheme) {
    DarkColorPalette
  } else {
    LightColorPalette
  }

  MaterialTheme(
    colors = colors,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}


@Composable
fun BasicsCodelabTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  val colors = if (darkTheme) {
    BasicsDarkColorPalette
  } else {
    BasicsLightColorPalette
  }

  MaterialTheme(
    colors = colors,
    typography = MaterialTheme.typography,
    shapes = MaterialTheme.shapes,
    content = content
  )
}