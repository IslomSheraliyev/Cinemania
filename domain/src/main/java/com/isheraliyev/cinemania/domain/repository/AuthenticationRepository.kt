package com.isheraliyev.cinemania.domain.repository

import com.isheraliyev.cinemania.domain.models.CreateSessionModel
import com.isheraliyev.cinemania.domain.models.GuestSessionModel
import com.isheraliyev.cinemania.domain.models.RequestTokenModel

interface AuthenticationRepository {

    suspend fun createGuestSession(): GuestSessionModel

    suspend fun createRequestToken(): RequestTokenModel

    suspend fun createSession(apiKey: String, requestToken: String): CreateSessionModel
}