package com.example.android.mvpwithottobustoyapp.utils;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by hIT on 2/10/2017.
 */

public class OttoBus {
    private static Bus instance = new Bus(ThreadEnforcer.MAIN);

    public static Bus getInstance(){
        return instance;
    }

}
