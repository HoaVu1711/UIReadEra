package com.vdh.testnavigation.ui.feedback;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FeedBackViewModel extends ViewModel {
    private MutableLiveData<String>mText;

    public FeedBackViewModel() {
        mText=new MutableLiveData<>();
        mText.setValue("this is Fragment Feedback");
    }

    public MutableLiveData<String> getText() {
        return mText;
    }
}