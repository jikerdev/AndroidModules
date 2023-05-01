package cn.jkdev.video

import android.app.Application
import android.util.Log
import cn.jkdev.base.ModuleMediator

class App : ModuleMediator.AppInitial {
    override fun init(app: Application) {
        Log.i("VideoApp", "Video module init")
    }
}