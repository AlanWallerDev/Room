package com.example.t00053669.room;

/**
 * Created by t00053669 on 1/17/2018.
 */

public class UserManager {

    static void aSyncAddUser(final MyDatabase db, final User u){
        new Thread(new Runnable() {
            @Override
            public void run() {
                db.userDAO().insertUser(u);
            }
        }).start();
    }

    static void aSyncGetAllUser(final MyDatabase db){
        new Thread(new Runnable() {
            @Override
            public void run() {
                db.userDAO().getAll();
            }
        }).start();
    }
}
