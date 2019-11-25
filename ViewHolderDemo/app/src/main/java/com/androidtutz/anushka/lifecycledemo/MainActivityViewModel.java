package com.androidtutz.anushka.lifecycledemo;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int clickCount=0;


    public  int getCount(){

        return clickCount;
    }


    public  int getCurrentCount(){

        clickCount+=1;
        return clickCount;
    }

}
