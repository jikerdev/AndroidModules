package cn.jkdev.setting

import android.app.Application
import android.util.Log
import cn.jkdev.base.ModuleMediator

class App : ModuleMediator.AppInitial {
    override fun init(app: Application) {
        Log.i("SettingApp", "Setting module init")
    }
}