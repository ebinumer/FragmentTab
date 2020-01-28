package com.example.fragmenttabz;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragmenttabz.tabs.Tab1;
import com.example.fragmenttabz.tabs.tab2;
import com.example.fragmenttabz.tabs.tab3;

public class Pageadapter extends FragmentPagerAdapter {

    int mNoOfTabs;
    public Pageadapter(FragmentManager fm,int numberoftabs)
    {
        super(fm);
        this.mNoOfTabs=numberoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1 Ttab1=new Tab1();
                return  Ttab1;
            case 1:
                tab2 Ttab2=new tab2();
                return  Ttab2;
            case 2:
                tab3 Ttab3=new tab3();
                return  Ttab3;
                default: return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
