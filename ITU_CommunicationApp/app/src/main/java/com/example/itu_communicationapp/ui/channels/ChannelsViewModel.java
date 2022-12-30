package com.example.itu_communicationapp.ui.channels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChannelsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ChannelsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Subscribe to channels based on your interests");
    }

    public LiveData<String> getText() {
        return mText;
    }
}