package com.example.itu_communicationapp.database;

//This class contains the static final class 'EventTable'. Through EventDbSchema the SQL table is created
//with its necessary columns as well as a name for the table.

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