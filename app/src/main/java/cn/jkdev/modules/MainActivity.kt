package cn.jkdev.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cn.jkdev.setting.SettingActivity
import cn.jkdev.video.VideoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.bt_video).setOnClickListener {
            startActivity(Intent(this, VideoActivity::class.java))
        }
        findViewById<View>(R.id.bt_setting).setOnClickListener {
            startActivity(Intent(this, SettingActivity::class.java))
        }
    }
}