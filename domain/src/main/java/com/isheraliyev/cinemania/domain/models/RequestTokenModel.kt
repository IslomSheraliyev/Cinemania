package com.isheraliyev.cinemania.domain.models

data class RequestTokenModel(
    val success: Boolean,
    val expiresAt: String,
    val requestToken: String
)
