package com.isheraliyev.data.remote.api

import com.isheraliyev.data.remote.response.AuthCreateGuestSessionResponse
import com.isheraliyev.data.remote.response.AuthCreateRequestTokenResponse
import com.isheraliyev.data.remote.response.AuthCreateSessionResponse
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthenticationApi {

    @GET
    suspend fun createGuestSession(): AuthCreateGuestSessionResponse

    @GET
    suspend fun createRequestToken(): AuthCreateRequestTokenResponse

    @POST
    suspend fun createSession(
        @Query("api_key") apiKey: String,
        @Query("request_token") requestToken: String
    ): AuthCreateSessionResponse

    //TODO: Create deleteSession function and implement it
}