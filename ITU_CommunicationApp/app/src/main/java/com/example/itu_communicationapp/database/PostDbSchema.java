package com.example.itu_communicationapp.database;

public class PostDbSchema {

    public static final class PostTable {
        public static final String NAME = "Posts";

        public static final class Cols {
            public static final String POSTTITLE = "name";
            public static final String CONTENT = "content";  //where is a keyword in SQL
            public static final String DATE = "date";

        }
    }
}