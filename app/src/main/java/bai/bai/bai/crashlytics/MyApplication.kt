package bai.bai.bai.crashlytics

import android.app.Application
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric

class MyApplication: Application(){

    override fun onCreate() {
        super.onCreate()
//        Fabric.with(this, Crashlytics())
    }

}