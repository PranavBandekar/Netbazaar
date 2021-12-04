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
        //FontsUtils.setFont(this,context,null);
    }

    public NetbazaarTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
        //FontsUtils.setFont(this,context,attrs);
    }

    public NetbazaarTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontsUtils.setFont(this, context, attrs);
    }
}
