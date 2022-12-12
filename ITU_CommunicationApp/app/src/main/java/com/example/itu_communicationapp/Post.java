package com.example.itu_communicationapp;

public class Post {

    private String pTitle;
    private String pContent;
    private date pDate;


    public Post(String title, String content, date date) {
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

    public date getDate() {
        return pDate;
    }

}