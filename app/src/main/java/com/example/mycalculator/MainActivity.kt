package com.example.mycalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycalculator.ui.theme.MyCalculatorTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CalculatorApp()
                }
            }
        }
    }
}

@Composable
fun CalculatorApp() {
    CalculatorUi()
}

@Composable
fun CalculatorUi (modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)) {
            Column(horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
                Text(text = "123", fontSize = 70.sp, fontWeight = FontWeight.Bold)
            }
        }
        Spacer(modifier = Modifier.height(70.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            CalculatorButton("AC", "()", "%", "/")
            CalculatorButton("1", "2", "3", "x")
            CalculatorButton("4", "5", "6", "-")
            CalculatorButton("7", "8", "9", "+")
            CalculatorButton("0", ".", "%", "=")
        }
    }
}

@Composable
fun CalculatorButton(firstButton: String, secondButton: String, thirdButton: String, fourthButton: String) {
    Row() {
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color(0xFFC3ECD2)), modifier = Modifier
            .padding(6.dp)
            .width(80.dp)
            .height(80.dp)) {
            Text(text = firstButton, fontSize = 24.sp)
        }
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color(0xFFC3ECD2)), modifier = Modifier
            .padding(6.dp)
            .width(80.dp)
            .height(80.dp)) {
            Text(text = secondButton, fontSize = 28.sp)
        }
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color(0xFFC3ECD2)), modifier = Modifier
            .padding(6.dp)
            .width(80.dp)
            .height(80.dp)) {
            Text(text = thirdButton, fontSize = 28.sp)
        }
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color(0xFFC3ECD2)), modifier = Modifier
            .padding(6.dp)
            .width(80.dp)
            .height(80.dp)) {
            Text(text = fourthButton, fontSize = 28.sp)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CalculatorAppPreview() {
    CalculatorApp()
}