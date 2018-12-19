package bai.bai.bai.crashlytics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_secends.*

class SecendsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secends)

        btn_secend_start.setOnClickListener {
            var str: String? = null
            Log.d("baibai", "长度：${str!!.length}")
        }

    }
}
