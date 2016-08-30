package com.ex.dn.myapplication;

import com.firebase.client.Firebase;

/**
 * Created by dn on 26/08/16.
 */
public class MyApp  extends  android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}
