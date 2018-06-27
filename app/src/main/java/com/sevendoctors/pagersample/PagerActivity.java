package com.sevendoctors.pagersample;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.abualzait.sevendoctorspager.*;
import com.abualzait.sevendoctorspager.pager.*;
import com.abualzait.sevendoctorspager.transformers.SevenDoctorsPagerTransformer;
import com.abualzait.sevendoctorspager.views.GlazyImageView.ImageCutType;

public class PagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pager);
        setTitle("7 Doctors");

        SevenDoctorsViewPager mPager = findViewById(R.id.pager);
        SevenDoctorsFragmentPagerAdapter mPagerAdapter = new SevenDoctorsFragmentPagerAdapter
                (getSupportFragmentManager(), getApplicationContext());

        Resources resources = getApplicationContext().getResources();
        int ic_motasem = resources.getIdentifier("motasim", "drawable", getPackageName());
        int ic_dana = resources.getIdentifier("dana", "drawable", getPackageName());
        int ic_nagham = resources.getIdentifier("nagham", "drawable", getPackageName());
        int ic_shadi = resources.getIdentifier("shadi", "drawable", getPackageName());
        int ic_zaid = resources.getIdentifier("zaid", "drawable", getPackageName());

        String desc_motasim = "الدكتور معتصم مسالمة ، طبيب مقيم طب وجراحة العيون في الخدمات " +
                "الطبية الملكية الأردنية ، اشتهر من خلال برنامجه الطبي التوعوي الأطباء السبعة " +
                "الذي يبث على قناة رؤيا الفضائية الأردنية كأول ظهور إعلامي طبي له ، محب للعمل " +
                "التطوعي وكان له بصمات واضحة لنشر فكرة العمل التطوعي في الأردن وفلسطين\n" +
                "\n";

        String desc_dana = "الصيدلانية دانا الجعبري\n";

        String desc_nagham = "الدكتورة نغم القرة غولي\n";

        String desc_shadi = "الدكتور شادي الشيخ\n";

        String desc_zaid = "";

        mPagerAdapter.addCardItem(
                new SevenDoctorsCard()
                        .withTitle("Motasim Masalmeh")
                        .withSubTitle("Doctor Title")
                        .withDescription(desc_motasim)
                        .withImageRes(ic_motasem)
                        .withImageCutType(ImageCutType.WAVE)
                        .withImageCutHeightDP(40)
        );
        mPagerAdapter.addCardItem(
                new SevenDoctorsCard()
                        .withTitle("Dr.Dana")
                        .withSubTitle("Doctor Description")
                        .withDescription(desc_dana)
                        .withImageRes(ic_dana)
                        .withImageCutType(ImageCutType.LINE_POSITIVE)
                        .withImageCutHeightDP(40)
        );
        mPagerAdapter.addCardItem(
                new SevenDoctorsCard()
                        .withTitle("Dr.Zaid Abu ghosh")
                        .withSubTitle("Robotic Surgeon")
                        .withDescription(desc_zaid)
                        .withImageRes(ic_zaid)
                        .withImageCutType(ImageCutType.LINE_POSITIVE)
                        .withImageCutHeightDP(40)
        );
        mPagerAdapter.addCardItem(
                new SevenDoctorsCard()
                        .withTitle("Dr.Nagham")
                        .withSubTitle("Doctor Description")
                        .withDescription(desc_nagham)
                        .withImageRes(ic_nagham)
                        .withImageCutType(ImageCutType.ARC)
                        .withImageCutHeightDP(40)
        );
        mPagerAdapter.addCardItem(
                new SevenDoctorsCard()
                        .withTitle("Shadi Alshaikh")
                        .withSubTitle("Doctor Description")
                        .withDescription(desc_shadi)
                        .withImageRes(ic_shadi)
                        .withImageCutType(ImageCutType.LINE_POSITIVE)
                        .withImageCutHeightDP(40)
        );

        mPager.setAdapter(mPagerAdapter);
        mPager.setPageMargin(Utils.dpToPx(getApplicationContext(), 25));
        mPager.setPageTransformer(false, new SevenDoctorsPagerTransformer());
    }

}
