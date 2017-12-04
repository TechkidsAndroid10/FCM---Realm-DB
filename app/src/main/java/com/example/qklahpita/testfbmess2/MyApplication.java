package com.example.qklahpita.testfbmess2;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by qklahpita on 12/3/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
