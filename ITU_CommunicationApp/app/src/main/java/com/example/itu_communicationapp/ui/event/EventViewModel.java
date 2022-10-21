package com.example.itu_communicationapp.ui.event;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EventViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EventViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("split view; top view signed up events, bottom view list of events chronologically incl. sign up deadline + signup button - on the left side perhaps a button to see calendar overview incl. courses + hand-ins dates (from LearnIT)");
    }

    public LiveData<String> getText() {
        return mText;
    }
}