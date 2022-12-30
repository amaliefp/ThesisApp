package com.example.itu_communicationapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();  //LiveData ensures that our UI matches our data state
        mText.setValue("The home screen is a news feed where posts from channels, events and courses are highlighted based on user preferences.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}