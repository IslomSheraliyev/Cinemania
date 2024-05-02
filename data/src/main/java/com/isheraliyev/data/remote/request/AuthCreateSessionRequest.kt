package com.isheraliyev.data.remote.request

data class AuthCreateSessionRequest(
    val api_key: String?,
    val request_token: String?
)