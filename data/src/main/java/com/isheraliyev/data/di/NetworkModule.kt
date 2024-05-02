package com.isheraliyev.data.di

import com.google.gson.Gson
import com.isheraliyev.data.constants.Constants
import com.isheraliyev.data.remote.api.AuthenticationApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Qualifier
    annotation class AuthApiRetrofit

    @[Singleton Provides]
    fun provideGson() = Gson()

    @[Singleton Provides]
    fun provideGsonConverter(gson: Gson): GsonConverterFactory = GsonConverterFactory.create(gson)

    @[Singleton Provides]
    fun provideAuthenticationApi(
        @AuthApiRetrofit retrofit: Retrofit
    ): AuthenticationApi {
        return retrofit.create(AuthenticationApi::class.java)
    }

    @AuthApiRetrofit
    @[Singleton Provides]
    fun provideAuthRetrofit(
        okHttpClient: OkHttpClient,
        moshiFactory: GsonConverterFactory,
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(moshiFactory)
            .build()
    }
}
