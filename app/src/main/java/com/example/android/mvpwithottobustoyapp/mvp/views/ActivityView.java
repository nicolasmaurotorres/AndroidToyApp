package com.example.android.mvpwithottobustoyapp.mvp.views;

import android.app.Activity;
import android.support.annotation.Nullable;

import java.lang.ref.WeakReference;

/**
 * Created by hIT on 2/10/2017.
 */

public class ActivityView {
    private WeakReference<Activity> _activityRef;

    public ActivityView(Activity activity) {
        _activityRef = new WeakReference<>(activity);
    }

    @Nullable
    public Activity getActivity() {
        return _activityRef.get();
    }
}
