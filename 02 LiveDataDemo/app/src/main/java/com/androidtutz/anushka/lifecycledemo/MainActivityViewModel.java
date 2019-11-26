package com.androidtutz.anushka.lifecycledemo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

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
