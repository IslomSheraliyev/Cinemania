package com.isheraliyev.data.repository

import com.isheraliyev.cinemania.domain.models.CreateSessionModel
import com.isheraliyev.cinemania.domain.models.GuestSessionModel
import com.isheraliyev.cinemania.domain.models.RequestTokenModel
import com.isheraliyev.cinemania.domain.repository.AuthenticationRepository
import com.isheraliyev.data.mappers.AuthenticationMapper
import com.isheraliyev.data.remote.api.AuthenticationApi
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val api: AuthenticationApi
) : AuthenticationRepository {
    override suspend fun createGuestSession(): GuestSessionModel {
        return api.createGuestSession().let(AuthenticationMapper.createGuestSessionMapper)
    }

    override suspend fun createRequestToken(): RequestTokenModel {
        return api.createRequestToken().let(AuthenticationMapper.createRequestTokenMapper)
    }

    override suspend fun createSession(apiKey: String, requestToken: String): CreateSessionModel {
        return api.createSession(apiKey, requestToken).let(AuthenticationMapper.createSessionMapper)
    }

}