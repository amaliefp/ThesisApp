package com.example.itu_communicationapp.database;

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