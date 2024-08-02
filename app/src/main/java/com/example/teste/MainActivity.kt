package com.example.teste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teste.ui.theme.TesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TesteTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    app()
                }
            }
        }
    }
}


@Composable
fun app(modifier: Modifier = Modifier) {
    var name by remember  { mutableStateOf("")}
    var age by remember  { mutableStateOf("")}

    Column() {
        Spacer(modifier = modifier.height(20.dp))

        Row(modifier = Modifier
            .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "App DataBase",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }

        Spacer(modifier = modifier.height(20.dp))

        Row(modifier = Modifier
            .fillMaxWidth(),
            Arrangement.Center) {
            TextField(
                value = name,
                onValueChange = { newName ->
                    name= newName
                },
                label = { Text("Name") },
            )

        }

        Spacer(modifier = modifier.height(20.dp))

        Row(modifier = Modifier
            .fillMaxWidth(),
            Arrangement.Center) {
            TextField(
                value = age,
                onValueChange = {newAge ->
                    age = newAge},
                label = { Text("Age") },
            )
        }

        Spacer(modifier = modifier.height(20.dp))

        Row(modifier = Modifier
            .fillMaxWidth(),
            Arrangement.Center) {
            Button(
                onClick = {
                    // Handle button click
                },
                elevation = ButtonDefaults.elevatedButtonElevation(8.dp) // Button elevation
            ) {
                Text("Register")
            }
        }
    }
}

@Composable
@Preview
fun appPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        app()
    }
}