package com.rba.customtogglebutton.util.customtogglebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Ricardo Bravo on 24/05/16.
 */

public class CustomToggleButton extends RadioButton {

    public CustomToggleButton(Context context) {
        super(context);
    }

    public CustomToggleButton(Context context, AttributeSet attributes) {
        super(context, attributes);
    }

    public CustomToggleButton(Context context, AttributeSet attributes, int defStyle) {
        super(context, attributes, defStyle);
    }


    @Override
    public void toggle() {
        if(isChecked()) {
            ViewParent parent = getParent();
            if(parent instanceof RadioGroup) {
                ((RadioGroup) parent).clearCheck();
            }
        } else {
            setChecked(true);
        }
    }
}

