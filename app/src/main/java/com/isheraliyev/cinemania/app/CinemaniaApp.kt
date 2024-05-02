package com.isheraliyev.cinemania.app

import android.app.Application
import android.content.Context
import com.isheraliyev.data.local.AppPreferences
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CinemaniaApp : Application() {
    companion object {
        lateinit var application: Context
    }

    override fun onCreate() {
        super.onCreate()
        application = this
        AppPreferences.init(this)
    }
}