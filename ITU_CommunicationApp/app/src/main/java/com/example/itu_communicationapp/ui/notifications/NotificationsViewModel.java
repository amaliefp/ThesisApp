package com.example.itu_communicationapp.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Home page will function as newsfeed- so considering making this tab into a 'profile tab' instead");
    }

    public LiveData<String> getText() {
        return mText;
    }
}