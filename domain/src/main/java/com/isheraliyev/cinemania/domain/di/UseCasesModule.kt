package com.isheraliyev.cinemania.domain.di

import com.isheraliyev.cinemania.domain.repository.AuthenticationRepository
import com.isheraliyev.cinemania.domain.usecases.auth.CreateGuestSessionUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {

    @[Singleton Provides]
    fun provideCreateGuestSessionUseCase(repository: AuthenticationRepository) =
        CreateGuestSessionUseCase(repository)
}