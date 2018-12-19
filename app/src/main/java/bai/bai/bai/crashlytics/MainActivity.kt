package bai.bai.bai.crashlytics

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric

class MainActivity : Activity() {

    private var datas: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Fabric.with(this, Crashlytics())
        setContentView(R.layout.activity_main)
        Fabric.with(this, Crashlytics())

        btn_start.setOnClickListener {
//            Log.d("baibai", "${datas!!.length}")
            startActivity(Intent(this@MainActivity, SecendsActivity::class.java))
        }
    }
}

