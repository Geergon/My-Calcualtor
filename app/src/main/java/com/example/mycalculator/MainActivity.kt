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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var counter by remember { mutableStateOf(0) }
    var counterScreen by remember { mutableStateOf(counter.toString()) }
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
                Text(text = counterScreen, fontSize = 70.sp, fontWeight = FontWeight.Bold)
            }
        }
        Spacer(modifier = Modifier.height(70.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            Row() {
                Button(onClick = { counterScreen + 1 }, colors = ButtonDefaults.buttonColors(Color(0xFFC3ECD2)), modifier = Modifier
                    .padding(6.dp)
                    .width(80.dp)
                    .height(80.dp)) {
                    Text(text = "1", fontSize = 24.sp)
                }
                Button(onClick = { counterScreen + "2" }, colors = ButtonDefaults.buttonColors(Color(0xFFC3ECD2)), modifier = Modifier
                    .padding(6.dp)
                    .width(80.dp)
                    .height(80.dp)) {
                    Text(text = "2", fontSize = 24.sp)
                }
//                CalculatorButton("AC", 0xFFC3ECD2, buttonFun = {counterScreen += "1"})
//                CalculatorButton("()", 0xFFC3ECD2, buttonFun = {counterScreen += "2"})
//                CalculatorButton("%", 0xFFC3ECD2)
//                CalculatorButton("/", 0xFFC3ECD2)
            }
            Row {
//                CalculatorButton("1", 0xFFC3ECD2)
//                CalculatorButton("2", 0xFFC3ECD2)
//                CalculatorButton("3", 0xFFC3ECD2)
//                CalculatorButton("x", 0xFFC3ECD2)
            }
            Row {
//                CalculatorButton("4", 0xFFC3ECD2)
//                CalculatorButton("5", 0xFFC3ECD2)
//                CalculatorButton("6", 0xFFC3ECD2)
//                CalculatorButton("-", 0xFFC3ECD2)
            }
            Row {
//                CalculatorButton("7", 0xFFC3ECD2)
//                CalculatorButton("8", 0xFFC3ECD2)
//                CalculatorButton("9", 0xFFC3ECD2)
//                CalculatorButton("+", 0xFFC3ECD2)
            }
            Row {
//                CalculatorButton("0", 0xFFC3ECD2)
//                CalculatorButton(".", 0xFFC3ECD2)
//                CalculatorButton("%", 0xFFC3ECD2)
//                CalculatorButton("=", 0xFFC3ECD2)
            }
        }
    }
}

@Composable
fun CalculatorButton(text: String, color: Long, buttonFun: (Int) -> Unit )  {
    Button(onClick = { buttonFun }, colors = ButtonDefaults.buttonColors(Color(color)), modifier = Modifier
        .padding(6.dp)
        .width(80.dp)
        .height(80.dp)) {
        Text(text = text, fontSize = 24.sp)
    }
}

@Preview(showSystemUi = true)
@Composable
fun CalculatorAppPreview() {
    CalculatorApp()
}