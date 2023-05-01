package cn.jkdev.base

import android.app.Application

object ModuleMediator {
    const val ACTIVITY_SETTING_CLASS = "cn.jkdev.setting.SettingActivity"
    const val ACTIVITY_VIDEO_CLASS = "cn.jkdev.video.VideoActivity"

    private const val APP_SETTING_CLASS = "cn.jkdev.setting.App"
    private const val APP_VIDEO_CLASS = "cn.jkdev.video.App"

    interface AppInitial {
        fun init(app: Application)
    }

    fun init(app: Application) {
        val appClasses = arrayOf(APP_SETTING_CLASS, APP_VIDEO_CLASS)

        for (claName in appClasses) {
            try {
                val clazz = Class.forName(claName)
                val appInitial = clazz.newInstance() as AppInitial
                appInitial.init(app)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
