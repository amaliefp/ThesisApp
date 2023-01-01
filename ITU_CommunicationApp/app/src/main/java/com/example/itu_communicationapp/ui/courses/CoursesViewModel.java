package com.example.itu_communicationapp.ui.courses;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * This ViewModel contains the logic and data for the Courses screen
 */
public class CoursesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CoursesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Courses overview from LearnIT");
    }

    public LiveData<String> getText() {
        return mText;
    }
}