package com.abualzait.sevendoctorspager.pager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

import com.abualzait.sevendoctorspager.transformers.SevenDoctorsPagerTransformer;

/**
 * Created by kannan on 5/6/17.
 */

public class SevenDoctorsViewPager extends ViewPager {

    Context mContext;

    public SevenDoctorsViewPager(Context context) {
        super(context);
        init(context, null);
    }

    public SevenDoctorsViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public void init(Context context, AttributeSet attrs) {
        mContext = context;

        setOffscreenPageLimit(2);
        setClipToPadding(false);
    }

    @Override
    public void setAdapter(PagerAdapter adapter) {
        if (adapter instanceof SevenDoctorsFragmentPagerAdapter) {
            super.setAdapter(adapter);
        }
    }

    @Override
    public void setPageTransformer(boolean reverseDrawingOrder, PageTransformer transformer) {
        if (transformer instanceof SevenDoctorsPagerTransformer) {
            ((SevenDoctorsPagerTransformer) transformer).attachedPager(this);
            super.setPageTransformer(reverseDrawingOrder, transformer, LAYER_TYPE_NONE);
        }
    }

    @Override
    public void setPageTransformer(boolean reverseDrawingOrder, PageTransformer transformer, int pageLayerType) {
        if (transformer instanceof SevenDoctorsPagerTransformer) {
            ((SevenDoctorsPagerTransformer) transformer).attachedPager(this);
            super.setPageTransformer(reverseDrawingOrder, transformer, LAYER_TYPE_NONE);
        }
    }
}
