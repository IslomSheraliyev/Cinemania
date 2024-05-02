package com.isheraliyev.data.remote.response

data class AuthCreateRequestTokenResponse(
    val success: Boolean?,
    val expires_at: String?,
    val request_token: String?
)
