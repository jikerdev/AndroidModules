package cn.jkdev.base

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    protected fun startActivity(className: String, bundle: Bundle? = null) {
        try {
            val clazz = Class.forName(className)
            val intent = Intent(this, clazz)
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
            Toast.makeText(this, "找不到${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    protected fun startActivityForResult(
        className: String,
        requestCode: Int,
        bundle: Bundle? = null
    ) {
        try {
            val clazz = Class.forName(className)
            val intent = Intent(this, clazz)
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivityForResult(intent, requestCode)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
            Toast.makeText(this, "找不到${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}
