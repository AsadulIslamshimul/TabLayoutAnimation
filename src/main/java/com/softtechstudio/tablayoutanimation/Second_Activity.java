package com.softtechstudio.tablayoutanimation;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.ArrayList;
import devlight.io.library.ntb.NavigationTabBar;

public class Second_Activity extends AppCompatActivity {

    NavigationTabBar navigationTabBar;

    ViewPager viewPager;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        viewPager =  findViewById(R.id.viewpagerID);
        viewPager.setAdapter(new com.softtechstudio.tablayoutanimation.PagerAdapter(getSupportFragmentManager()));

        navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_baseline_home_24),
                        getResources().getColor(R.color.colorPrimary)
                ).title("Home")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_baseline_eco_24),
                        getResources().getColor(R.color.colorPrimary)
                ).title("Recent")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_baseline_photo_library_24),
                        getResources().getColor(R.color.colorPrimary)
                ).title("Popular")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_baseline_video_library_24),
                        getResources().getColor(R.color.colorPrimary)
                ).title("Blank")
                        .build()
        );

        navigationTabBar.setModels(models);

        navigationTabBar.setViewPager(viewPager,0);
        navigationTabBar.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                navigationTabBar.getModels().get(position).hideBadge();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        navigationTabBar.setTitleMode(NavigationTabBar.TitleMode.ACTIVE);
        navigationTabBar.setBadgeGravity(NavigationTabBar.BadgeGravity.BOTTOM);
        navigationTabBar.setBadgePosition(NavigationTabBar.BadgePosition.CENTER);
        navigationTabBar.setIsBadged(true);
        navigationTabBar.setIsTitled(true);
        navigationTabBar.setIsTinted(true);
        navigationTabBar.setIsBadgeUseTypeface(true);
        navigationTabBar.setIsSwiped(true);
    }


}