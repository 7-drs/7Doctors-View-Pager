package com.abualzait.sevendoctorspager.pager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.abualzait.sevendoctorspager.SevenDoctorsCard;
import com.abualzait.sevendoctorspager.fragments.SevenDoctorsCardFragment;

import java.util.ArrayList;

public class SevenDoctorsFragmentPagerAdapter extends AbstractFragmentPagerAdapter {

    private int CARDS_COUNT = 0;

    private ArrayList<SevenDoctorsCard> cards;
    private Context context;

    public SevenDoctorsFragmentPagerAdapter(FragmentManager fm, Context ctx) {
        super(fm);
        context = ctx;
        cards = new ArrayList<>();
    }

    public void addCardItem(SevenDoctorsCard card) {
        cards.add(card);
        updateCount();
    }

    public void removeCardItem(int position) {
        try {
            cards.remove(position);
            updateCount();
        } catch (Exception e) { }
    }

    public void removeCardItem(SevenDoctorsCard card) {
        try {
            cards.remove(card);
            updateCount();
        } catch (Exception e) { }
    }

    private void updateCount() {
        CARDS_COUNT = cards.size();
        notifyDataSetChanged();
    }

    @Override
    public Fragment instantiateFragment(int position) {
        SevenDoctorsCard card = cards.get(position);
        return SevenDoctorsCardFragment.newInstance( card );
    }

    @Override
    public int getCount() {
        return CARDS_COUNT;
    }
}
