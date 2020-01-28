package com.example.fragmenttabz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import com.example.fragmenttabz.tabs.Tab1;
import com.example.fragmenttabz.tabs.tab2;
import com.example.fragmenttabz.tabs.tab3;
import com.google.android.material.tabs.TabLayout;
/*
            simple fragment tab
            using recyclerview(each have diffrent view and diff adapter)
* created by najmudheen
*
* */
public class MainActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, tab2.OnFragmentInteractionListener, tab3.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tab=findViewById(R.id.tablayout);
        tab.addTab(tab.newTab().setText("CHATS"));  //name of first tab
        tab.addTab(tab.newTab().setText("UPLOAD"));  //name of second tab
        tab.addTab(tab.newTab().setText("NOTIFICATION"));   //name of 3rd tab

        tab.setTabTextColors(Color.parseColor("#c0c0c0"),Color.parseColor("#ffffff")); //color of tab when not select and when select
        tab.setTabGravity(TabLayout.GRAVITY_FILL);

        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("WhatsBook");    //name of app on the top toolbar
        toolbar.setTitleTextColor(android.graphics.Color.WHITE);
        final ViewPager vewp=findViewById(R.id.pager);
        Pageadapter pageadapter=new Pageadapter(getSupportFragmentManager(),tab.getTabCount());
        vewp.setAdapter(pageadapter);
        vewp.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));

        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vewp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }




}
