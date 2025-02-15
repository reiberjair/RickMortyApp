package com.ira.rickmortyapp.ui.home.tabs.characters

import app.cash.paging.PagingData
import com.ira.rickmortyapp.domain.model.CharacterModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class CharactersState (
    val characterOfTheDay:CharacterModel? = null,
    val characters:Flow<PagingData<CharacterModel>> = emptyFlow()
)