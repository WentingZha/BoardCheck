package com.zwt.boardcheck

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BoardCheckApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}