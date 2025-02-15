package com.ira.rickmortyapp.di

import com.ira.rickmortyapp.ui.home.tabs.characters.CharactersViewModel
import com.ira.rickmortyapp.ui.home.tabs.episodes.EpisodesViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val uiModule = module {
    viewModelOf(::EpisodesViewModel)
    viewModelOf(::CharactersViewModel)

}