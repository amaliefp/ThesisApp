package com.example.itu_communicationapp.database;

import java.util.Date;

/**
 * This class contains the static final class 'EventTable' which contains the schema for the database.
 * Through EventDbSchema the SQL table is created with its defined columns and a name for this table.
 * */
public class EventDbSchema {

    public static final class EventTable {
        public static final String NAME = "Events";

        public static final class Cols {
            public static final String EVENTTITLE = "name";
            public static final String CONTENT = "content";  //where is a keyword in SQL
            public static final String DATE = "date";

        }
    }
}