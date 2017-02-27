package com.example.andylv.mycamer2;

import android.app.Application;
import android.content.Context;

/**
 * Created by andy.lv on 2017/2/23.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
