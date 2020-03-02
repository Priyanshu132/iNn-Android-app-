package com.example.inn.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.inn.R;
import com.example.inn.frag1;
import com.example.inn.frag2;
import com.example.inn.frag3;
import com.example.inn.frag4;
import com.example.inn.frag5;
import com.example.inn.frag6;
import com.example.inn.frag7;

public class section extends FragmentPagerAdapter {

    @StringRes
    private static final int[] getTabTitles = new int[]{R.string.tab_1, R.string.tab_2, R.string.tab_3, R.string.tab_4, R.string.tab_5, R.string.tab_6, R.string.tab_7};
    private final Context mContext;

    public section(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new frag1();
                break;
            case 1:
                fragment = new frag2();
                break;
            case 2:
                fragment = new frag3();
                break;
            case 3:
                fragment = new frag4();
                break;
            case 4:
                fragment = new frag5();
                break;
            case 5:
                fragment = new frag6();
                break;
            case 6:
                fragment = new frag7();
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(getTabTitles[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 7;
    }
}
