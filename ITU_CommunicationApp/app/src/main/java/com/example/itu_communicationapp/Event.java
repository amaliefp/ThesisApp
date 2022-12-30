package com.example.itu_communicationapp;

public class Event {

    //add Event ID
    private String eTitle;
    private String eContent;
    private String eDate;


    public Event(String title, String content, String date) {
        eTitle = title;
        eContent = content;
        eDate = date;
    }

    public String getTitle() {
        return eTitle;
    }

    public String getContent() {
        return eContent;
    }

    public String getDate() {
        return eDate;
    }

}