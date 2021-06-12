package net.maiatoday.composesampler.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.maiatoday.composesampler.ui.theme.ComposeSamplerTheme

@Composable
fun RandomPieButton(modifier: Modifier = Modifier) {
    var percentage by remember { mutableStateOf(0.0f) }
    Button(onClick = { percentage = (0..100).random()/100.0f}) {
        PieStatus(
            modifier = modifier,
            pieData = PieData(
                strokeWidth = 6.dp,
                foreground = MaterialTheme.colors.onSurface,
                percentage = percentage
            )
        )
    }
}

@Preview(
    name = "RandomPieButton Night Preview",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "RandomPieButton Day Preview",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun DefaultRandomPiePreview() {
    ComposeSamplerTheme {
        RandomPieButton(
            modifier = Modifier
                .size(56.dp)
        )
    }
}