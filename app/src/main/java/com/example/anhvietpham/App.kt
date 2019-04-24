package com.example.anhvietpham

import android.app.Application
import com.avp.di.KoinModules
import org.koin.core.Koin
import org.koin.standalone.StandAloneContext

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        StandAloneContext.startKoin(KoinModules.modules())
    }
}