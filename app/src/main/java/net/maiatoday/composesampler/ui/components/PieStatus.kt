package net.maiatoday.composesampler.ui.components

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.maiatoday.composesampler.ui.theme.ComposeSamplerTheme

data class PieData(
    val foreground: Color = Color.White,
    val strokeWidth: Dp = 4.dp,
    val percentage: Float
)

@Composable
fun PieStatus(
    modifier: Modifier = Modifier,
    pieData: PieData
) {
    Canvas(
        modifier = modifier
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawCircle(
            color = pieData.foreground,
            center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
            radius = canvasWidth/2 - pieData.strokeWidth.toPx(),
            style = Stroke(width = pieData.strokeWidth.toPx())
        )
        val arcPadding = pieData.strokeWidth.toPx() * 2
        drawArc(
            color = pieData.foreground,
            startAngle = -90f,
            sweepAngle = pieData.percentage * 360,
            useCenter = true,
            topLeft = Offset(arcPadding, arcPadding),
            size = Size(size.width - (arcPadding * 2f), size.height - (arcPadding * 2f))
        )
    }
}

@Preview(
    name = "PieStatus Night Preview",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES)
@Preview(
    name = "PieStatus Day Preview",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_NO)
@Composable
fun DefaultPreview() {
    ComposeSamplerTheme {
        PieStatus(
            modifier = Modifier
                .size(56.dp)
                .padding(8.dp),
            pieData = PieData(
                foreground = colors.onSurface,
                percentage = 0.62f)
        )
    }
}