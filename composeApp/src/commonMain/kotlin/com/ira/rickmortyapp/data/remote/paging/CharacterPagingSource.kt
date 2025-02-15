package com.ira.rickmortyapp.data.remote.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.ira.rickmortyapp.data.remote.ApiService
import com.ira.rickmortyapp.domain.model.CharacterModel
import io.ktor.utils.io.errors.IOException

class CharactersPagingSource(private val api:ApiService): PagingSource<Int, CharacterModel>() {
    override fun getRefreshKey(state: PagingState<Int, CharacterModel>): Int? {
        return state.anchorPosition
    }


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CharacterModel> {
        return try {
            val page = params.key ?: 1
            val response = api.getAllCharacters(page)
            val characters = response.results
            val prev = if (page>0) - 1 else null
            val next = if (response.info.next != null) page + 1 else null
            LoadResult.Page (
                data = characters.map { characterResponse -> characterResponse.toDomain() },
                prevKey = prev,
                nextKey = next
            )
        } catch (ex: IOException) {
            LoadResult.Error(ex)
        }

        }
    }


