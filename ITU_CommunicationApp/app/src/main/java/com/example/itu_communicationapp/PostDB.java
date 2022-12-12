package com.example.itu_communicationapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


import com.example.kebabapp.database.ItemsDbSchema;
import com.example.kebabapp.database.ItemCursorWrapper;
import com.example.kebabapp.database.ItemBaseHelper;
//need to create these classes as well ^

public class PostDB extends Observable {
    private static SQLiteDatabase pDatabase;
    private static PostDB pPostDB;

    private PostDB(Context context) {
        if (getAll().size() == 0)
    }
}