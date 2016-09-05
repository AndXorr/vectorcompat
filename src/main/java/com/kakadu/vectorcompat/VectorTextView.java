package com.kakadu.vectorcompat;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class VectorTextView extends AppCompatTextView {

    public VectorTextView(Context context) {
        this(context, null);
    }

    public VectorTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public VectorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        VectorCompatUtil.initAttrs(this, attrs);
    }
}
