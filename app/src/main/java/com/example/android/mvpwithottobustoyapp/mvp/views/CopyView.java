package com.example.android.mvpwithottobustoyapp.mvp.views;

import android.app.Activity;
import android.widget.EditText;

import com.example.android.mvpwithottobustoyapp.R;
import com.example.android.mvpwithottobustoyapp.utils.OttoBus;
import com.example.android.mvpwithottobustoyapp.utils.events.CopyEvent;
import com.example.android.mvpwithottobustoyapp.utils.events.ResetEvent;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CopyView extends ActivityView {

    @BindView(R.id.toCopyEditText) EditText _copyEditText;
    @BindView(R.id.targetEditText) EditText _targetEditText;

    public CopyView(Activity activity) {
        super(activity);
        ButterKnife.bind(this,activity);
    }

    public void setStringToTarget(String newWord){
        _targetEditText.setText(newWord);
    }

    @OnClick(R.id.copyButton)
    public void copyButtonPressed(){
        OttoBus.getInstance().post(new CopyEvent());
    }

    @OnClick(R.id.resetButton)
    public void resetButtonPressed(){
        OttoBus.getInstance().post(new ResetEvent());
    }

    public String getNewWord() {
        return _copyEditText.getText().toString();
    }

    public void resetText() {
        _copyEditText.setText("");
    }
}
