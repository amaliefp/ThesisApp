package com.example.itu_communicationapp.ui.events;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.itu_communicationapp.Event;

import java.util.ArrayList;
import java.util.List;

public class EventsViewModel extends ViewModel {

    //private final MutableLiveData<Event> mEvent;
    private static ArrayList eventList;

    public EventsViewModel() {
        //this.mEvent = new MutableLiveData<>();
        //mEvent.setValue("I'm an event", "by event", "19/01-2022");
        this.eventList = new ArrayList<>();
        eventList.add(new Event("1", "fdsf", "gdfd"));
        eventList.add(new Event("2", "fdsf", "gdfd"));
        eventList.add(new Event("3", "fdsf", "gdfd"));
        eventList.add(new Event("4", "fdsf", "gdfd"));
    }

    public ArrayList<Event> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<Event> eventList) {
        EventsViewModel.eventList = eventList;
    }
}