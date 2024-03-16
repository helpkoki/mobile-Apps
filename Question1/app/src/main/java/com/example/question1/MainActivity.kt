package com.example.question1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.question1.ui.theme.Question1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Question1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color =Color.Yellow
                ) {
                    TUT()
                }
            }
        }
    }
}

@Composable
fun TUT(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally ,modifier = modifier.padding(10.dp).fillMaxSize()) {
        Surface(
            color = MaterialTheme.colors.primarySurface,
            elevation = 8.dp
        ) {
            Text(
                text = "TUT Mobile",
               // modifier = Modifier.padding(8.dp)
            )
        }
        Surface(
            color =Color.Red,
            border = BorderStroke(1.dp, MaterialTheme.colors.secondary),
            //shape = RoundedCornerShape(8.dp),
            elevation = 8.dp
        ) {
            Text(
                text = "222556562",
                modifier = Modifier.padding(30.dp)
            )
        }
        Surface(
            color = Color.White, //MaterialTheme.colors.primarySurface
            elevation = 8.dp
        ) {
            Text(
                text = "Android Compose",
               // modifier = Modifier.padding(8.dp)
            )
        }
   }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Question1Theme {
        TUT()
    }
}