package cn.jkdev.video.debug

import android.app.Application
import cn.jkdev.video.App

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        App().init(this)
    }
}