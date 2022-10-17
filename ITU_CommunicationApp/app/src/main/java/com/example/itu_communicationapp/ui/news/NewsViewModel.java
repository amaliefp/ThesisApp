package com.example.itu_communicationapp.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Overview of 'channels' you are subscribed to (e.g. scroll bar, novo nordisk, private group channels') + un/subscribe button, list overview of other channel (new channels first) + un/subscribe button, when clicking on a channel we can see posts related to this channel");
    } //change name 'news' to 'channels'

    public LiveData<String> getText() {
        return mText;
    }
}