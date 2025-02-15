package com.ira.rickmortyapp

import androidx.compose.ui.window.ComposeUIViewController
import com.ira.rickmortyapp.di.initKoin

fun MainViewController() = ComposeUIViewController( configure = { initKoin() } ) { App() }