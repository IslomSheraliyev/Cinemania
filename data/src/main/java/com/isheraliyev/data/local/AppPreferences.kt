package com.isheraliyev.data.local

import android.content.Context
import android.content.SharedPreferences

object AppPreferences {

    private const val CINEMANIA = "cinemania"
    private const val DEF_STR = "null"
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(CINEMANIA, Context.MODE_PRIVATE)
    }

    var guestSessionId: String
        get() = preferences.getString(this::guestSessionId.name, DEF_STR) ?: DEF_STR
        set(value) {
            preferences.edit().putString(this::guestSessionId.name, value).apply()
        }

    var guestSessionIdExpirationDate: String
        get() = preferences.getString(this::guestSessionIdExpirationDate.name, DEF_STR) ?: DEF_STR
        set(value) {
            preferences.edit().putString(this::guestSessionIdExpirationDate.name, value).apply()
        }

    var sessionId: String
        get() = preferences.getString(this::sessionId.name, DEF_STR) ?: DEF_STR
        set(value) {
            preferences.edit().putString(this::sessionId.name, value).apply()
        }



}