package com.xenia.customviewterminal.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.xenia.customviewterminal.ui.theme.CustomViewTerminalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test()
//            CustomViewTerminalTheme {
//                val viewModel: TerminalViewModel = viewModel()
//                val screenState = viewModel.state.collectAsState()
//                when (val currentState = screenState.value) {
//                    is TerminalScreenState.Content -> {
//                        Terminal(bars = currentState.barList)
//                        Log.d("MainActivity", currentState.barList.toString())
//                    }
//
//                    is TerminalScreenState.Initial -> {
//
//                    }
//                }
//            }
        }
    }
}