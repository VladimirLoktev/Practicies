package ru.mirea.loktev.room;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {
    public static ru.mirea.loktev.room.App instance;
    private AppDatabase database;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(this, AppDatabase.class, "database")
                .allowMainThreadQueries()
                .build();
    }
    public static ru.mirea.loktev.room.App getInstance() {
        return instance;
    }
    public AppDatabase getDatabase() {
        return database;
    }
}