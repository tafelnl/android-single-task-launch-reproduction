package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("MainActivity - onCreate - isTaskRoot: $isTaskRoot")

        setContent {
            val context = LocalContext.current
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF_000000))
                        .padding(16.dp)
                ) {
                    BasicText(
                        text = "First",
                        modifier = Modifier.clickable(onClick = {
                            startActivity(Intent(context, SecondActivity::class.java))
                        }),
                        style = TextStyle.Default.copy(color = Color(0xFF_FFFFFF), fontSize = 32.sp)
                    )
                }
            }
        }
    }

    public override fun onStart() {
        super.onStart()
        println("MainActivity - onStart - isTaskRoot: $isTaskRoot")
    }

    public override fun onRestart() {
        super.onRestart()
        println("MainActivity - onRestart - isTaskRoot: $isTaskRoot")
    }

    public override fun onResume() {
        super.onResume()
        println("MainActivity - onResume - isTaskRoot: $isTaskRoot")
    }
}