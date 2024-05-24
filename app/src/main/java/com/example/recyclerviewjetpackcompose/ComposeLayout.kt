package com.example.recyclerviewjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.recyclerviewjetpackcompose.ui.theme.JetPackComposeLearningTheme

class ComposeLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeLearningTheme {
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

    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(text = "A", fontSize = 24.sp)
        Text(text = "A", fontSize = 24.sp)


    }
    Row (horizontalArrangement = Arrangement.Absolute.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){

        Text(text = "B", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }

    Box(contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Dummy")
        Image(painter = painterResource(id = R.drawable.baseline_broken_image_24), contentDescription = "Dummy")
    }
}

@Preview(showBackground = true , widthDp = 300, heightDp = 500)
@Composable
fun GreetingPreview2() {
    JetPackComposeLearningTheme {
        Greeting("Android")
    }
}