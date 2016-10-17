package com.example.yusuf.finaltourapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

public class event_page_click extends AppCompatActivity {

    TabHost tabHost;

    public void backButton(View view) {

        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page_click);

        getSupportActionBar().hide();



        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec ts1= tabHost.newTabSpec("INFO");

        ts1.setIndicator("INFO");
        ts1.setContent(R.id.eventInfoLayout);
        tabHost.addTab(ts1);

        TabHost.TabSpec ts2= tabHost.newTabSpec("FOOD");

        ts2.setIndicator("FOOD");
        ts2.setContent(R.id.foodLayout);
        tabHost.addTab(ts2);


        TabHost.TabSpec ts3= tabHost.newTabSpec("FACILITIES");

        ts3.setIndicator("FACILITIES");
        ts3.setContent(R.id.facilityLayout);
        tabHost.addTab(ts3);


        TabHost.TabSpec ts4= tabHost.newTabSpec("PICS");

        ts4.setIndicator("PICS");
        ts4.setContent(R.id.picLayout);
        tabHost.addTab(ts4);

        TabHost.TabSpec ts5= tabHost.newTabSpec("T&C");

        ts5.setIndicator("T&C");
        ts5.setContent(R.id.conditionLayout);
        tabHost.addTab(ts5);




        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            View v = tabHost.getTabWidget().getChildAt(i);
            v.setBackgroundResource(R.color.background);



            TextView tv = (TextView) v.findViewById(android.R.id.title);
            tv.setTextColor(getResources().getColor(R.color.white));
            if(i==0){

                tv.setTextColor(getResources().getColor(R.color.colorB));
            }


            tv.setTextSize(25f);

        }

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {


                for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
                    View v = tabHost.getTabWidget().getChildAt(i);

                    TextView tv = (TextView) v.findViewById(android.R.id.title);
                    tv.setTextColor(getResources().getColor(R.color.white));
                    if(tv.getText().toString().equals(s)){

                        tv.setTextColor(getResources().getColor(R.color.colorB));
                    }
                    else {
                        tv.setTextColor(getResources().getColor(R.color.white));
                    }




                }
            }
        });


    }
}
