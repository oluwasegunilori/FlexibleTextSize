package com.shegz.flexibletextsize

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shegz.flexibletextsize.compose.flexibleFontSize
import com.shegz.flexibletextsize.ui.theme.FlexibleTextSizeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlexibleTextSizeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        fontSize = MaterialTheme.typography.bodyLarge.fontSize.flexibleFontSize(min = 16F, max = 24F )
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FlexibleTextSizeTheme {
        Greeting("Android")
    }
}