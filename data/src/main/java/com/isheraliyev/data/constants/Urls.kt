package com.isheraliyev.data.constants

internal object Authentication {
    private const val PRE = "authentication"
    const val GUEST_SESSION = "${PRE}/guest_session/new"
    const val REQUEST_TOKEN = "${PRE}/token/new"
    const val CREATE_SESSION = "${PRE}/session/new"
    const val DELETE_SESSION = "${PRE}/session"
}