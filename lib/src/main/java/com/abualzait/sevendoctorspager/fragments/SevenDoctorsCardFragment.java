package com.abualzait.sevendoctorspager.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.*;

import com.abualzait.sevendoctorspager.*;
import com.abualzait.sevendoctorspager.views.SevenDoctorsImageView;

import java.util.Objects;

public class SevenDoctorsCardFragment extends Fragment {

    private Context mContext;
    private SevenDoctorsCard card;

    public static SevenDoctorsCardFragment newInstance(SevenDoctorsCard card) {
        SevenDoctorsCardFragment sevenDoctorsCardFragment = new SevenDoctorsCardFragment();
        Bundle args = new Bundle();
        args.putSerializable("sevendoctors", card);
        sevenDoctorsCardFragment.setArguments(args);

        return sevenDoctorsCardFragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        card = (SevenDoctorsCard) Objects.requireNonNull(getArguments()).getSerializable("sevendoctors");
        mContext = getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.layout_page, container, false);
        v.setBackgroundColor(card.getBackgroundColor());

        //TextView description = v.findViewById(R.id.description_text);
    //    description.setText(card.getDescription());
     //   description.setAlpha(0f);

        SevenDoctorsImageView imgView = v.findViewById(R.id.glazy_image_view);
        imgView.setImageRes(card.getImageRes());
        imgView.setTitleText(card.getTitle());
        imgView.setTitleTextColor(card.getTitleColor());
        imgView.setTitleTextSize(Utils.dpToPx(mContext, card.getTitleSizeDP()));
        imgView.setSubTitleText(card.getSubTitle());
        imgView.setSubTitleTextColor(card.getSubTitleColor());
        imgView.setSubTitleTextSize(Utils.dpToPx(mContext, card.getSubTitleSizeDP()));
        imgView.setTextMargin(Utils.dpToPx(mContext, card.getTextmatginDP()));
        imgView.setLineSpacing(Utils.dpToPx(mContext, card.getLineSpacingDP()));
        imgView.setAutoTint(card.isAutoTint());
        imgView.setTintColor(card.getTintColor());
        imgView.setTintAlpha(card.getTintAlpha());
        imgView.setCutType(card.getImageCutType());
        imgView.setCutCount(card.getImageCutCount());
        imgView.setCutHeight(Utils.dpToPx(mContext,card.getImageCutHeightDP()));

        return v;
    }

}
