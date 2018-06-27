package com.abualzait.sevendoctorspager.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abualzait.sevendoctorspager.SevenDoctorsCard;
import com.kannan.glazy.R;
import com.abualzait.sevendoctorspager.Utils;
import com.abualzait.sevendoctorspager.views.GlazyImageView;

public class GlazyCardFragment extends Fragment {

    private Context mContext;
    private SevenDoctorsCard card;

    public static GlazyCardFragment newInstance(SevenDoctorsCard card) {
        GlazyCardFragment glazyCardFragment = new GlazyCardFragment();
        Bundle args = new Bundle();
        args.putSerializable("glazy_card", card);
        glazyCardFragment.setArguments(args);

        return glazyCardFragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        card = (SevenDoctorsCard) getArguments().getSerializable("glazy_card");
        mContext = getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.layout_page, container, false);
        v.setBackgroundColor(card.getBackgroundColor());

        TextView description = (TextView) v.findViewById(R.id.description_text);
        description.setText(card.getDescription());
        description.setAlpha(0f);

        GlazyImageView imgView = (GlazyImageView) v.findViewById(R.id.glazy_image_view);
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
