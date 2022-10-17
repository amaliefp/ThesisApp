package com.example.itu_communicationapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("See RSS newsfeed, suggestions for events, button to write messages");
    }

    public LiveData<String> getText() {
        return mText;
    }
}