package com.example.recyclerviewjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.R
import com.example.recyclerviewjetpackcompose.ui.theme.JetPackComposeLearningTheme

class ListView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeLearningTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListViewItem(R.drawable.notification_icon_background , "John Doe" ,"Software Engineer")
                }
            }
        }
    }
}

@Composable
fun ListViewItem(imgId : Int , name : String , occupation : String) {

    Row(
        Modifier.padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "ListView",
            Modifier.size(60.dp)
        )
        Column {
            Text(text = name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text(text = occupation, fontSize = 12.sp)
        }
    }

}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun GreetingPreview3() {
    JetPackComposeLearningTheme {
        Column {
            ListViewItem(R.drawable.ic_call_decline , "John Doe1" ,"Software Engineer1")
            ListViewItem(R.drawable.ic_call_decline , "John Doe2" ,"Software Engineer2")
            ListViewItem(R.drawable.ic_call_decline , "John Doe3" ,"Software Engineer3")
            ListViewItem(R.drawable.ic_call_decline , "John Doe4" ,"Software Engineer3")

        }
    }
}