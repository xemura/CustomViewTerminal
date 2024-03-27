package com.xenia.customviewterminal.presentation

import com.xenia.customviewterminal.data.Bar

sealed class TerminalScreenState {

    data object Initial : TerminalScreenState()

    data class Content(val barList: List<Bar>) : TerminalScreenState()
}