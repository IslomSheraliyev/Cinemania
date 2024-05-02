package com.isheraliyev.data.remote.response

data class AuthCreateGuestSessionResponse(
    val success: Boolean?,
    val guest_session_id: String?,
    val expires_at: String?
)
