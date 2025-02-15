package com.ira.rickmortyapp.ui.core.navigation

sealed class Routes(val route:String) {
    data object Home:Routes("home")

    //BottonNav
    data object Episodes:Routes("episodes")

    data object Characters:Routes("characters")
}