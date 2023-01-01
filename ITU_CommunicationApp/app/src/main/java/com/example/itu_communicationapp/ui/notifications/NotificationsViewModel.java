package com.example.itu_communicationapp.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * This ViewModel contains the logic and data for the Notifications screen
 */
public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("No new notifications - all up to date!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}