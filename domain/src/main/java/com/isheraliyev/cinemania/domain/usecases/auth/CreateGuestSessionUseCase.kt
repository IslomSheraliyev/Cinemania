package com.isheraliyev.cinemania.domain.usecases.auth

import com.isheraliyev.cinemania.domain.global.UseCase
import com.isheraliyev.cinemania.domain.models.GuestSessionModel
import com.isheraliyev.cinemania.domain.repository.AuthenticationRepository
import kotlinx.coroutines.Dispatchers

class CreateGuestSessionUseCase(
    private val repository: AuthenticationRepository
) : UseCase<GuestSessionModel>(Dispatchers.IO) {
    override suspend fun execute(): GuestSessionModel {
        return repository.createGuestSession()
    }
}