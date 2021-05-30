package com.vdh.testnavigation.ui.format;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormatViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is format fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}