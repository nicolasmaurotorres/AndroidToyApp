package com.example.android.mvpwithottobustoyapp.mvp.presenters;

import android.app.Activity;
import android.util.Log;

import com.example.android.mvpwithottobustoyapp.mvp.models.CopyModel;
import com.example.android.mvpwithottobustoyapp.mvp.views.CopyView;
import com.example.android.mvpwithottobustoyapp.utils.OttoBus;
import com.example.android.mvpwithottobustoyapp.utils.events.CopyEvent;
import com.example.android.mvpwithottobustoyapp.utils.events.ResetEvent;
import com.squareup.otto.Subscribe;

/**
 * Created by hIT on 2/10/2017.
 */

public class CopyPresenter {
    private CopyModel model;
    private CopyView view;

    public CopyPresenter(CopyView cw, CopyModel cm){
        this.view = cw;
        this.model = cm;
    }

    @Subscribe
    public void onCopyButtonPressed(CopyEvent copyEvent){
        Log.d("captura","copy");
        String newWord = view.getNewWord();
        model.setString(newWord);
        view.setStringToTarget(model.getString());
    }

    @Subscribe
    public void onResetButtonPressed(ResetEvent resetEvent){
        Log.d("captura","reset");
        view.resetText();
        model.resetString();
        view.setStringToTarget(model.getString());
    }

    public void register() {
        OttoBus.getInstance().register(this);

    }

    public void unregister() {
        OttoBus.getInstance().unregister(this);
    }
}
