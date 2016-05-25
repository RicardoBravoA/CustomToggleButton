package com.rba.customtogglebutton;

import android.widget.RadioGroup;

/**
 * Created by Ricardo Bravo on 25/05/16.
 */

public class ControlClass implements  RadioGroup.OnCheckedChangeListener {

    private MainActivity mActivity;
    private String selected;
    private RadioGroup rgTab;
    public ControlClass(MainActivity mActivity, RadioGroup rgTab){
        this.mActivity = mActivity;
        this.rgTab = rgTab;

        rgTab.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.tgb1:
                selected = "1";
                break;
            case R.id.tgb2:
                selected = "2";
                break;
            case R.id.tgb3:
                selected = "3";
                break;
            default:
                selected = "0";
                break;
        }
    }

    public void setControlClass(String type){

        switch (type){
            case "1":
                rgTab.check(R.id.tgb1);
                break;
            case "2":
                rgTab.check(R.id.tgb2);
                break;
            case "3":
                rgTab.check(R.id.tgb3);
                break;
            default:
                break;
        }


    }

    public String getControlClass(){
        return selected;
    }

}
