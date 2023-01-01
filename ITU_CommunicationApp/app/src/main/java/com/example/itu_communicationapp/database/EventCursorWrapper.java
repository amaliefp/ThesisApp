package com.example.itu_communicationapp.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.itu_communicationapp.Event;
import com.example.itu_communicationapp.database.EventDbSchema.EventTable;

//The Cursor Wrapper class works as a cursor that goes through the SQL table and finds the event that has already been put in.
//The cursor then creates a new Event object that can be shown in the application (e.g., in the Events view)

public class EventCursorWrapper extends CursorWrapper{
    public EventCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Event getEvent() {
        String title = getString(getColumnIndex(EventTable.Cols.EVENTTITLE));
        String content = getString(getColumnIndex(EventTable.Cols.CONTENT));
        String date = getString(getColumnIndex(EventTable.Cols.DATE));
        return new Event(title, content, date);
    }
}
