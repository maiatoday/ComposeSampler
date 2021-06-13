package net.maiatoday.composesampler

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.maiatoday.composesampler.ui.components.PieData
import net.maiatoday.composesampler.ui.components.PieStatus
import net.maiatoday.composesampler.ui.components.RandomPieButton
import net.maiatoday.composesampler.ui.theme.ComposeSamplerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSamplerTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface {
            Text(
                text = "Hello $name!",
                modifier = Modifier.padding(8.dp)
            )
        }
        RandomPieButton(
            modifier = Modifier
                .size(64.dp)
                .padding(2.dp)
        )
    }
}

@Preview(
    name = "Main Screen Night Preview",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Preview(
    name = "MainScreen Day Preview",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true
)
@Composable
fun DefaultPreview() {
    ComposeSamplerTheme {
        Greeting("Android")
    }
}