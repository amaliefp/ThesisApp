package com.example.itu_communicationapp.ui.channels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChannelsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ChannelsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Overview of 'channels' you are subscribed to (e.g. scroll bar, novo nordisk, private group channels') + un/subscribe button, list overview of other channel (new channels first) + un/subscribe button, when clicking on a channel we can see posts related to this channel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}