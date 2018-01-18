package com.example.t00053669.room;

import android.app.Application;

/**
 * Created by t00053669 on 1/17/2018.
 */

public class App extends Application {
    public static App INSTANCE;

    private static final String INSTANCE_NAME = "user_database";

    private MyDatabase database;

    public static App get() {return INSTANCE;}

    public void onCreate() {
        super.onCreate();

        database = MyDatabase.getDataBase(this);

        INSTANCE = this;
    }

}
