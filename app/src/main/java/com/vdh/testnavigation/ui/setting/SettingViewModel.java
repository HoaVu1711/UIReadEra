package com.vdh.testnavigation.ui.setting;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingViewModel extends ViewModel {
    private MutableLiveData<String>mText;

    public SettingViewModel() {
        mText=new MutableLiveData<>();
        mText.setValue("this is fragmnet setting");
    }

    public MutableLiveData<String> getText() {
        return mText;
    }
}