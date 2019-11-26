package com.androidtutz.anushka.lifecycledemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int clickCount = 0;
    private MutableLiveData<Integer> liveDataCount = new MutableLiveData<>();

    public MutableLiveData<Integer> getInitialCount() {

        liveDataCount.setValue(clickCount);
        return liveDataCount;
    }

    public void getCurrentCount() {

        liveDataCount.setValue(clickCount++);
    }
}
