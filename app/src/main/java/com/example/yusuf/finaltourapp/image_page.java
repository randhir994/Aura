package com.example.yusuf.finaltourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

public class image_page extends AppCompatActivity {
    public void backButton(View v){
        super.onBackPressed();
    }

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_page);
        getSupportActionBar().hide();




        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec ts1= tabHost.newTabSpec("INFO");

        ts1.setIndicator("INFO");
        ts1.setContent(R.id.infoLayout);
        tabHost.addTab(ts1);


        TabHost.TabSpec ts2= tabHost.newTabSpec("SCHEDULE");

        ts2.setIndicator("SCHEDULE");
        ts2.setContent(R.id.scheduleLayout);
        tabHost.addTab(ts2);

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
