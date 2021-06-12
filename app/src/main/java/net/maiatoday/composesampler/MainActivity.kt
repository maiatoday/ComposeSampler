package net.maiatoday.composesampler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row {
        Text(text = "Hello $name!")
        RandomPieButton(
            modifier = Modifier.size(64.dp).padding(2.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeSamplerTheme {
        Greeting("Android")
    }
}