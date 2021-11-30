package com.netbazaar.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.netbazaar.utilities.FontsUtils;

public class NetbazaarTextView extends AppCompatTextView {

    public NetbazaarTextView(Context context) {
        this(context, null);
        //super(context);
    }

    public NetbazaarTextView(Context context, AttributeSet attrs) {
        //super(context, attrs);
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public NetbazaarTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontsUtils.setFont(this, context, attrs);
    }
}
