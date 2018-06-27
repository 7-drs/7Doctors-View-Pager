package com.abualzait.sevendoctorspager.transformers;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.kannan.glazy.R;
import com.abualzait.sevendoctorspager.pager.SevenDoctorsViewPager;
import com.abualzait.sevendoctorspager.views.SevenDoctorsImageView;

public class SevenDoctorsPagerTransformer implements ViewPager.PageTransformer {

    private SevenDoctorsViewPager mPager;

    public SevenDoctorsPagerTransformer() {

    }

    @Override
    public void transformPage(View page, float posActual) {

        float posCorrection = - (float) mPager.getPaddingLeft() / page.getWidth();
        float position = posActual + posCorrection;

        if(Math.abs(position) <= 1.1f) {

            float factor = 1.0f - Math.abs(position);
            ((SevenDoctorsImageView) page.findViewById(R.id.glazy_image_view)).update(factor);
            (page.findViewById(R.id.description_text)).setAlpha(factor);

        }
    }

    public void attachedPager(SevenDoctorsViewPager pager) {
        mPager = pager;
    }
}