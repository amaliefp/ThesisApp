package com.example.itu_communicationapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.itu_communicationapp.database.EventBaseHelper;
import com.example.itu_communicationapp.database.EventCursorWrapper;
import com.example.itu_communicationapp.database.EventDbSchema;

import java.util.ArrayList;
import java.util.Observable;

//This class creates the SQLite database for Events and helps add and remove events from the database.
//It also has a method to return all Event objects in the database, so they can be shown in the application.

public class EventDB extends Observable {

    //We use an SQLite Database, as that is an internal database that is available on all Android devices.
    //The SQLite Database ensures persistence of the data across usages of the application
    private static SQLiteDatabase eDatabase;
    private static EventDB eEventDB;

    //Two constructor methods. These ensures that a database is not created
    //if a database already exists. By making the actual construction method private, we ensure
    //that not other class can make a new database.
    private EventDB(Context context) {
        if (getAll().size() == 0);
    }

    public static EventDB get (Context context) {
        if (eEventDB == null) {
            eDatabase = new EventBaseHelper(context.getApplicationContext()).getWritableDatabase();
            eEventDB = new EventDB(context);
        }
        return eEventDB;
    }

    //Method for adding a new event to the database.
    //It gets the values for a new event through the getContentValues method
    //and then inserts them into the table as a new event entry.
    public void addNewEvent(String title, String content, String date) {
        Event newEvent = new Event(title, content, date);
        ContentValues values = getContentValues(newEvent);
        eDatabase.insert(EventDbSchema.EventTable.NAME, null, values);
        this.setChanged(); notifyObservers();
    }

    //Method for removing an event from the SQL table.
    //A new Event object is created only with the title of the event that needs removing.
    //If the event is found in the table, it is deleted and the change is notified to Observers of the EventDB class..
    public void removeEvent(String title) {
        Event newEvent = new Event(title, "", "");
        String selection = EventDbSchema.EventTable.Cols.EVENTTITLE + " LIKE ?";
        int changed = eDatabase.delete(EventDbSchema.EventTable.NAME, selection, new String[]{newEvent.getTitle()});
        if (changed > 0) {
            this.setChanged();
            notifyObservers();
        }
    }

    //Method that returns an arraylist of all events in the SQL table.
    public ArrayList<Event> getAll() {
        ArrayList<Event> events = new ArrayList<Event>();
        EventCursorWrapper cursor = queryEvents(null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            events.add(cursor.getEvent());
            cursor.moveToNext();
        }
        cursor.close();
        return events;
    }

    //Adds the values of an Event objects to a 'ContentValues' object,
    //so it can be added to the SQL database when adding a new event to the table
    private static ContentValues getContentValues(Event event) {
        ContentValues values =  new ContentValues();
        values.put(EventDbSchema.EventTable.Cols.EVENTTITLE, event.getTitle());
        values.put(EventDbSchema.EventTable.Cols.CONTENT, event.getContent());
        values.put(EventDbSchema.EventTable.Cols.DATE, event.getDate());
        return values;
    }

    //Query for the events in the database.
    //The method is used in the getAll method.
    static private EventCursorWrapper queryEvents(String whereClause, String[] whereArgs) {
        Cursor cursor = eDatabase.query(
                EventDbSchema.EventTable.NAME,
                null, //columns - null selects all columns
                whereClause, whereArgs,
                null, //groupBy
                null, //having
                null //orderBy
        );
        return new EventCursorWrapper(cursor);
    }

}
