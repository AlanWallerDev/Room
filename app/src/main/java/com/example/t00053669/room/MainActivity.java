package com.example.t00053669.room;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MyDatabase db;
    private UserDAO userDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = MyDatabase.getDataBase(this);
        userDAO = db.userDAO();

    }

    public void onClick(View view){

        new Thread(new Runnable() {
            @Override
            public void run() {
                User u = new User("User1", "Pass1");
                db.userDAO().insertUser(u);

                List<User> l = db.userDAO().getAll();
                for(User ur:l){
                    Log.d("userapp", ur.toString());
                }
            }
        }).start();
    }
}
