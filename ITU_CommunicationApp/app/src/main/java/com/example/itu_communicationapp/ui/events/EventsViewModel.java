package com.example.itu_communicationapp.ui.events;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EventsViewModel extends ViewModel {

    //private final MutableLiveData<Event> mEvent;
    //private static ArrayList eventList;
    private final MutableLiveData<String> mText;

    public EventsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Events will be listed here; in the top part of the screen will be a list of events a user has signed up for and in the bottom part new events will be listed");
        //this.eventList = new ArrayList<>();
        //eventList.add(new Event("1", "fdsf", "gdfd"));
        //eventList.add(new Event("2", "fdsf", "gdfd"));
        //eventList.add(new Event("3", "fdsf", "gdfd"));
        //eventList.add(new Event("4", "fdsf", "gdfd"));
    }

    public LiveData<String> getText() {
        return mText;
    }

    //public ArrayList<Event> getEventList() {
    //    return eventList;
    //}

    //public void setEventList(ArrayList<Event> eventList) {
     //   EventsViewModel.eventList = eventList;
    //}
}