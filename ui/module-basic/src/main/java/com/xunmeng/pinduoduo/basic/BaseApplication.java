package com.xunmeng.pinduoduo.basic;

import android.app.Application;

/**
 * Created by Administrator on 2017/9/15 0015.
 */

public class BaseApplication extends Application {

    public static BaseApplication baseApplication;


   /* @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }*/

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }

    public static BaseApplication getApplication() {
        return baseApplication;
    }

    /*默认有网络*/
    private boolean networkAvailable = true;

    public boolean isNetworkAvailable() {
        return networkAvailable;
    }

    public void setNetworkAvailable(boolean networkAvailable) {
        this.networkAvailable = networkAvailable;
    }
}
