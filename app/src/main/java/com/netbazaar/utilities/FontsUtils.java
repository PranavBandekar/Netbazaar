package com.netbazaar.utilities;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.netbazaar.R;
import java.util.HashMap;

public class FontsUtils {
    
    public static final int poppins_black = 0;
    public static final int poppins_blackItalic = 1;
    public static final int poppins_bold = 2;
    public static final int poppins_boldItalic = 3;
    public static final int poppins_extraBold = 4;
    public static final int poppins_extraBoldItalic = 5;
    public static final int poppins_extraLight = 6;
    public static final int poppins_extraLightItalic = 7;
    public static final int poppins_italic = 8;
    public static final int poppins_light = 9;
    public static final int poppins_lightItalic = 10;
    public static final int poppins_medium = 11;
    public static final int poppins_mediumItalic = 12;
    public static final int poppins_regular = 13;
    public static final int poppins_semibold = 14;
    public static final int poppins_semiBoldItalic = 15;
    public static final int poppins_thin = 16;
    public static final int poppins_thinItalic = 17;

    private static HashMap<Integer, Typeface> fontCache = new HashMap<>();

    public static void setFont(TextView element, Context context, AttributeSet attrs){
        TypedArray attributeArray = context.obtainStyledAttributes(attrs, R.styleable.text_style);
        int textStyle = attributeArray.getInt(R.styleable.text_style_textStyle, poppins_regular);
        element.setTypeface(getTypeface(textStyle, context));
        attributeArray.recycle();
    }

    private static Typeface getTypeface(int fontStyle, Context context) {
        Typeface typeface = fontCache.get(fontStyle);
        if (typeface == null) {
            try {
                typeface = getFont(fontStyle, context);
            } catch (Exception e) {
                return null;
            }
            fontCache.put(fontStyle, typeface);
        }
        return typeface;
    }

    private static Typeface getFont(int fontForStyle, Context context) {
        Typeface typeface = null;

        switch (fontForStyle){
            case FontsUtils.poppins_black:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_black.ttf");
                break;
            case FontsUtils.poppins_blackItalic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_blackItalic.ttf");
                break;
            case FontsUtils.poppins_bold:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_bold.ttf");
                break;
            case FontsUtils.poppins_boldItalic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_boldItalic.ttf");
                break;
            case FontsUtils.poppins_extraBold:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_extraBold.ttf");
                break;
            case FontsUtils.poppins_extraBoldItalic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_extraBoldItalic.ttf");
                break;
            case FontsUtils.poppins_extraLight:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_extraLight.ttf");
                break;
            case FontsUtils.poppins_extraLightItalic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_extraLightItalic.ttf");
                break;
            case FontsUtils.poppins_italic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_italic.ttf");
                break;
            case FontsUtils.poppins_light:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_light.ttf");
                break;
            case FontsUtils.poppins_lightItalic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_lightItalic.ttf");
                break;
            case FontsUtils.poppins_medium:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_medium.ttf");
                break;
            case FontsUtils.poppins_mediumItalic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_mediumItalic.ttf");
                break;
            case FontsUtils.poppins_regular:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_regular.ttf");
                break;
            case FontsUtils.poppins_semibold:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_semibold.ttf");
                break;
            case FontsUtils.poppins_semiBoldItalic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_semiBoldItalic.ttf");
                break;
            case FontsUtils.poppins_thin:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_thin.ttf");
                break;
            case FontsUtils.poppins_thinItalic:
                typeface =Typeface.createFromAsset(context.getAssets(),"poppins_thinItalic.ttf");
                break;

        }
        return typeface;
    }


}
