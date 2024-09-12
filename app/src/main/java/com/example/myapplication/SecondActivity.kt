package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF_3C4043))
                        .padding(16.dp)
                ) {
                    BasicText(
                        text = "Second",
                        style = TextStyle.Default.copy(color = Color(0xFF_FFFFFF), fontSize = 32.sp)
                    )
                }
            }
        }
    }

    public override fun onStop() {
        super.onStop()
        println("SecondActivity - onStop - isTaskRoot: $isTaskRoot")
    }

    public override fun onPause() {
        super.onPause()
        println("SecondActivity - onPause - isTaskRoot: $isTaskRoot")
    }

    public override fun onResume() {
        super.onResume()
        println("SecondActivity - onResume - isTaskRoot: $isTaskRoot")
    }

    public override fun onDestroy() {
        super.onDestroy()
        println("SecondActivity - onDestroy - isTaskRoot: $isTaskRoot")
    }
}