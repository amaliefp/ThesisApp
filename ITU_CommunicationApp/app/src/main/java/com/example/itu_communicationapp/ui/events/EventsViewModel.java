package com.example.itu_communicationapp.ui.events;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * This ViewModel contains the logic and data for the Events screen
 */
public class EventsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EventsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Events will be listed here; in the top part of the screen will be a list of events a user has signed up for and in the bottom part new events will be listed");
    }

    public LiveData<String> getText() {
        return mText;
    }

}