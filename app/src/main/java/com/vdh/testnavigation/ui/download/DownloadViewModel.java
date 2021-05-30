package com.vdh.testnavigation.ui.download;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DownloadViewModel extends ViewModel {
    private MutableLiveData<String>mText;

    public DownloadViewModel() {
        mText=new MutableLiveData<>();
        mText.setValue("this is Fragmnet Download");
    }

    public MutableLiveData<String> getText() {
        return mText;
    }
}