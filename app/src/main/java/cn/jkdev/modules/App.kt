package cn.jkdev.modules

import android.app.Application
import cn.jkdev.base.ModuleMediator

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        ModuleMediator.init(this)
    }
}