package cn.jkdev.modules

import android.os.Bundle
import android.view.View
import cn.jkdev.base.BaseActivity
import cn.jkdev.base.ModuleMediator

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.bt_video).setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_VIDEO_CLASS)
        }
        findViewById<View>(R.id.bt_setting).setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_SETTING_CLASS)
        }
    }
}
