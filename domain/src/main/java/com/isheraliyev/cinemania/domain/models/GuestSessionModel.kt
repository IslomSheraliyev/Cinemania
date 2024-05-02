package com.isheraliyev.cinemania.domain.models

data class GuestSessionModel(
    val success: Boolean,
    val guestSessionId: String,
    val expiresAt: String
)