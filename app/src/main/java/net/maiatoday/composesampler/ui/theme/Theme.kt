package net.maiatoday.composesampler.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ComposeSamplerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
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

private val LunoDarkColorPalette = darkColors(
    primary = MoonBlue500,
    onPrimary = RocketWhite,
    primaryVariant = MoonBlue900,
    secondary = EarthBlue500,
    onSecondary = RocketWhite,
    surface = BlackHoleBlue,
    background = BlackHoleBlue
)

private val LunoLightColorPalette = lightColors(
    primary = MoonBlue900,
    onPrimary = RocketWhite,
    primaryVariant = MoonBlue500,
    secondary = EarthBlue500,
    onSecondary = RocketWhite
)

@Composable
fun LunoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        LunoDarkColorPalette
    } else {
        LunoLightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}