package com.hong_studio.myauctionapp.Tab1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Tab1PagerAdapter extends FragmentPagerAdapter {

    Fragment[] pages= new Fragment[2];
    String[] titles= new String[]{"실시간 경매중", "검토중인 경매"};

    public Tab1PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        pages[0]= new Tab1Page1Fragment();
        pages[1]= new Tab1Page2Fragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return pages[position];
    }

    @Override
    public int getCount() {
        return pages.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
