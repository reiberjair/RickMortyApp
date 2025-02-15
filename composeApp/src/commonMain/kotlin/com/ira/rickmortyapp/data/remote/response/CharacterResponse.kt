package com.ira.rickmortyapp.data.remote.response

import com.ira.rickmortyapp.domain.model.CharacterModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterResponse(
    @SerialName("id") val id: Int, val status: String, val image: String, val name: String
) {
    fun toDomain(): CharacterModel {
        return CharacterModel(
            id = id, isAlive = status.lowercase() == "alive", image = image, name = name
        )
    }
}