package com.ira.rickmortyapp.domain

import com.ira.rickmortyapp.domain.model.CharacterModel
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class GetRandomCharacter(private val repository: Repository) {
    suspend operator fun invoke(): CharacterModel {

      //  val characterDatabase = repository.gertSavedCharacter()

        val random = (1..826).random()
        return repository.getSingleCharacter(random.toString())
    }
    private fun getCurrentDayOfTheYear(): Int {
        val instant = Clock.System.now()
        val localTime: LocalDateTime = instant.toLocalDateTime(TimeZone.currentSystemDefault())
        return localTime.dayOfYear
    }

}