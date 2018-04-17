package com.example.isaiaschacon.galeriasisaias.Database;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Isaias Chacon on 29/03/2018.
 */

public class GaleriaApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
