package com.vdh.testnavigation.ui.series;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SeriesViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SeriesViewModel() {
        mText=new MutableLiveData<>();
        mText.setValue("this is Fragment series");
    }

    public MutableLiveData<String> getText() {
        return mText;
    }

 }