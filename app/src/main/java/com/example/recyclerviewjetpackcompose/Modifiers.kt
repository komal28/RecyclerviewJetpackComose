package com.example.recyclerviewjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recyclerviewjetpackcompose.ui.theme.JetPackComposeLearningTheme

class Modifiers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeLearningTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CircularImage()
                }
            }
        }
    }
}

@Composable
fun CircularImage(){
    Image(painter = painterResource(id = R.drawable.img_profile),
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray,CircleShape),
                contentDescription = "Circular Image"
    ) }

@Composable
fun Greeting2() {
    Text(
        text = "Hello",
        color = Color.White,
        modifier = Modifier
            .clickable { }
            .background(Color.Blue)
            .size(200.dp)
            .padding(16.dp)
            .border(4.dp, color = Color.Red)
            .clip(RectangleShape)
            .background(Color.Yellow)
    )
}

@Preview(showBackground = true , heightDp = 300, widthDp = 300)
@Composable
fun GreetingPreview4() {
    JetPackComposeLearningTheme {
        CircularImage()
    }
}