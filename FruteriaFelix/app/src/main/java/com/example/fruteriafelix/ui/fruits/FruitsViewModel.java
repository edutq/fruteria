package com.example.fruteriafelix.ui.fruits;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FruitsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FruitsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}