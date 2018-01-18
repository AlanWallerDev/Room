package com.example.t00053669.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by t00053669 on 1/17/2018.
 */
@Entity
public class User {
    @Ignore
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(int uID, String name, String password) {
        this.uID = uID;
        this.name = name;
        this.password = password;
    }

    @PrimaryKey (autoGenerate = true)
    public int uID;

    @ColumnInfo
    private String name;

    @ColumnInfo
    private String password;

    public void setuID(int uID) {
        this.uID = uID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getuID() {

        return uID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
