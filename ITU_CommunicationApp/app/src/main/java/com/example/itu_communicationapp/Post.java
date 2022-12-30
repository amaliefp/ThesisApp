package com.example.itu_communicationapp;

public class Post {

    //add Post ID
    private String pTitle;
    private String pContent;
    private int pDate;


    public Post(String title, String content, int date) {
        pTitle = title;
        pContent = content;
        pDate = date;
    }

    public String getTitle() {
        return pTitle;
    }

    public String getContent() {
        return pContent;
    }

    public int getDate() {
        return pDate;
    }

}