package com.example.itu_communicationapp.ui.channels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * This ViewModel contains the logic and data for the Channels screen
 */
public class ChannelsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ChannelsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("A forum where students can join channels based on their interest. Information can be posted and students can interact with each other via posts or comments");
    }

    public LiveData<String> getText() {
        return mText;
    }
}