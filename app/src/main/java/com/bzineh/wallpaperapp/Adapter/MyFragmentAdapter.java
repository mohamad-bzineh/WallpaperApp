package com.bzineh.wallpaperapp.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bzineh.wallpaperapp.Fragment.CategoryFragment;
import com.bzineh.wallpaperapp.Fragment.DailyPopularFragment;
import com.bzineh.wallpaperapp.Fragment.RecentsFragment;

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return CategoryFragment.getINSTANCE();
        else if (position == 1)
            return DailyPopularFragment.getINSTANCE();
        else if (position == 2)
            return RecentsFragment.getINSTANCE();
        else
            return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Category";
            case 1:
                return "Daily Popular";

            case 2:
                return "Recents";
        }
        return "";
    }
}
