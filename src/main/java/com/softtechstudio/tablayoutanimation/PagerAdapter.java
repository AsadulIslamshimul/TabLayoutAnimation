package com.softtechstudio.tablayoutanimation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagerAdapter extends FragmentPagerAdapter {
    private  int tabsNumber;

    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return  new Home_Fragment();

            case 1:
                return  new Recent_Fragment();

            case 2:
                return  new Popular_Fragment();

            case 3:
                return  new BlankFragment();

            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position){

        switch (position){

            case 0:
                return "Home";

                case 1:
                return "Recent";

                case 2:
                return "Popular";

                case 3:
                return "Blank";

        }
        return super.getPageTitle(position);
    }
}
