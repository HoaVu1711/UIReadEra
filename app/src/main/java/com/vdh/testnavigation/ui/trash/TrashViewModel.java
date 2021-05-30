package com.vdh.testnavigation.ui.trash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrashViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public TrashViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is trash fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}