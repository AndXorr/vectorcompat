package com.kakadu.vectorcompat;

import android.content.Context;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;

public class VectorRadioButton extends AppCompatRadioButton {

    public VectorRadioButton(Context context) {
        this(context, null);
    }

    public VectorRadioButton(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.radioButtonStyle);
    }

    public VectorRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        VectorCompatUtil.initAttrs(this, attrs);
    }
}
