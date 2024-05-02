package com.isheraliyev.data.mappers

import com.isheraliyev.cinemania.domain.models.CreateSessionModel
import com.isheraliyev.cinemania.domain.models.GuestSessionModel
import com.isheraliyev.cinemania.domain.models.RequestTokenModel
import com.isheraliyev.data.remote.response.AuthCreateGuestSessionResponse
import com.isheraliyev.data.remote.response.AuthCreateRequestTokenResponse
import com.isheraliyev.data.remote.response.AuthCreateSessionResponse

object AuthenticationMapper {
    val createGuestSessionMapper: Mapper<AuthCreateGuestSessionResponse, GuestSessionModel> =
        { remote ->
            GuestSessionModel(
                success = remote.success.orFalse(),
                guestSessionId = remote.guest_session_id.orEmpty(),
                expiresAt = remote.expires_at.orEmpty()
            )
        }

    val createRequestTokenMapper: Mapper<AuthCreateRequestTokenResponse, RequestTokenModel> =
        { remote ->
            RequestTokenModel(
                success = remote.success.orFalse(),
                expiresAt = remote.expires_at.orEmpty(),
                requestToken = remote.request_token.orEmpty()
            )
        }

    val createSessionMapper: Mapper<AuthCreateSessionResponse, CreateSessionModel> = { remote ->
        CreateSessionModel(
            success = remote.success.orFalse(),
            sessionId = remote.session_id.orEmpty()
        )
    }
}