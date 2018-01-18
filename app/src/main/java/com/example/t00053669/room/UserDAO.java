package com.example.t00053669.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by t00053669 on 1/17/2018.
 */
@Dao
public interface UserDAO {
    @Query("SELECT * FROM User")
    List<User> getAll();

    @Insert
    void insertUser(User...users);

    @Delete
    void deleteUser(User...users);

    @Update
    void update(User user);

}
