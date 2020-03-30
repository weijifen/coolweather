package com.coolweather.android;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.tencent.bugly.crashreport.CrashReport;

import org.litepal.LitePal;

/**
 * @author ZhangGang
 * @time 2020/3/17.
 */
public class MyApplication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        CrashReport.initCrashReport(getApplicationContext(), "013a1faf96", true);
        Stetho.initializeWithDefaults(this);
        LitePal.initialize(this);
    }

    public static Context getContext() {
        return context;
    }
}
