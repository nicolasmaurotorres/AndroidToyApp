package com.example.android.mvpwithottobustoyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.mvpwithottobustoyapp.mvp.models.CopyModel;
import com.example.android.mvpwithottobustoyapp.mvp.presenters.CopyPresenter;
import com.example.android.mvpwithottobustoyapp.mvp.views.CopyView;
import com.example.android.mvpwithottobustoyapp.utils.OttoBus;

public class MainActivity extends AppCompatActivity {

    private CopyPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new CopyPresenter(new CopyView(this), new CopyModel());
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.register();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.unregister();
    }
}
