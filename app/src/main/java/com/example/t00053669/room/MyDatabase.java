package com.example.t00053669.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by t00053669 on 1/17/2018.
 */
@Database(entities = User.class, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract UserDAO userDAO();

    private static MyDatabase instance = null;
    public static MyDatabase getDataBase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, MyDatabase.class, "user_database").allowMainThreadQueries().build();
        }
        return instance;
    }
}
