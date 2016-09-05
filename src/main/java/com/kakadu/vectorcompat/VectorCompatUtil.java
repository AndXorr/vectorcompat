package com.kakadu.vectorcompat;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.TextView;

public class VectorCompatUtil {

    public static void initAttrs(TextView textView, AttributeSet attrs) {
        if (attrs == null) return;
        TypedArray typedArray = textView.getContext().obtainStyledAttributes(attrs, R.styleable.VectorView);
        int drawableLeftId = typedArray.getResourceId(R.styleable.VectorView_drawableLeftCompat, 0);
        int drawableRightId = typedArray.getResourceId(R.styleable.VectorView_drawableRightCompat, 0);
        int drawableTopId = typedArray.getResourceId(R.styleable.VectorView_drawableTopCompat, 0);
        int drawableBottomId = typedArray.getResourceId(R.styleable.VectorView_drawableBottomCompat, 0);
        typedArray.recycle();

        Context context = textView.getContext();
        Drawable drawableLeft = tryGetDrawable(context, drawableLeftId);
        Drawable drawableRight = tryGetDrawable(context, drawableRightId);
        Drawable drawableTop = tryGetDrawable(context, drawableTopId);
        Drawable drawableBottom = tryGetDrawable(context, drawableBottomId);

        textView.setCompoundDrawables(drawableLeft, drawableTop, drawableRight, drawableBottom);
    }

    private static Drawable tryGetDrawable(Context context, int drawableId) {
        Drawable drawable = drawableId == 0 ? null : AppCompatResources.getDrawable(context, drawableId);
        if (drawable != null) {
            int height = drawable.getIntrinsicHeight();
            int width = drawable.getIntrinsicWidth();
            drawable.setBounds(0, 0, width, height);
        }
        return drawable;
    }
}
