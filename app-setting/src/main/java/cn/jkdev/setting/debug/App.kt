package cn.jkdev.setting.debug

import android.app.Application
import cn.jkdev.setting.App

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        App().init(this)
    }
}