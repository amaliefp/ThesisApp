package com.example.itu_communicationapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.itu_communicationapp.database.EventDbSchema.EventTable;

public class EventBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    public static final String DATABASE_NAME = "itu_communicationapp.db";

    public EventBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + EventTable.NAME + "(" +
                EventTable.Cols.EVENTTITLE + ", " + EventTable.Cols.CONTENT + ", " + EventTable.Cols.DATE +")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
