package com.kakadu.vectorcompat;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class VectorButton extends AppCompatButton {

    public VectorButton(Context context) {
        this(context, null);
    }

    public VectorButton(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.buttonStyle);
    }

    public VectorButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        VectorCompatUtil.initAttrs(this, attrs);
    }
}
