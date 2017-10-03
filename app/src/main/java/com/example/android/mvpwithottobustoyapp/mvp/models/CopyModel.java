package com.example.android.mvpwithottobustoyapp.mvp.models;

public class CopyModel {
    private String _toCopy;

    public void setString(String toCopy){
        _toCopy = toCopy;
    }

    public String getString(){
        return _toCopy;
    }

    public void resetString(){
        this._toCopy = "";
    }
}
