package com.example.itu_communicationapp;

/**
 * This class is for the 'Event' objects.
 * Each Event object is created with a title, content (description of event) and a date.
 */
public class Event {

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