package com.vdh.testnavigation.ui.Folder;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FolderViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FolderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is folder fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}