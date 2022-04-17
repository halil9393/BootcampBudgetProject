package com.example.bootcampbudgetproject;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.bootcampbudgetproject.models.MSpend;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {MSpend.class}, version = 1, exportSchema = false)
public abstract class SpendRoomDB extends RoomDatabase {

    public abstract MSpendDao mSpendDao();

    private static volatile SpendRoomDB INSTANCE;

    //opsiyoneldir, eğer thread sayısı custom verilmek istenirse kullanılabilir.
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);



    static SpendRoomDB getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (SpendRoomDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            SpendRoomDB.class,
                            "spend_database") //Not: Telefonda hangi isimde tutulacağını yazdık
                            .build();
                }
            }
        }
        return INSTANCE;
    }





}
