package com.isheraliyev.data.di

import com.isheraliyev.cinemania.domain.repository.AuthenticationRepository
import com.isheraliyev.data.repository.AuthenticationRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @[Singleton Provides]
    fun provideAuthenticationRepository(repository: AuthenticationRepositoryImpl): AuthenticationRepository =
        repository
}