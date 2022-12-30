package com.example.itu_communicationapp.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.itu_communicationapp.Post;
import com.example.itu_communicationapp.database.PostDbSchema.PostTable;


public class PostCursorWrapper extends CursorWrapper{
    public PostCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Post getPost() {
        String title = getString(getColumnIndex(PostTable.Cols.POSTTITLE));
        String content = getString(getColumnIndex(PostTable.Cols.CONTENT));
        int date = getInt(getColumnIndex(PostTable.Cols.DATE));
        return new Post(title, content, date);
    }
}
