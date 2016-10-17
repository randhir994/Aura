package com.example.yusuf.finaltourapp;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class create_event extends AppCompatActivity {
    public void nextActivity(View v){
        startActivity(new Intent(create_event.this, event_page_click.class));
    }
    public void backButton(View view){
        super.onBackPressed();
    }

    TextView createEventText6, createEventText7, createEventText3, createEventText4, createEventText5;

    LinearLayout createEventLayout1, createEventLayout2, createEventLayout3, createEventLayout4, createEventLayout5;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        getSupportActionBar().hide();


        createEventLayout1 = (LinearLayout) findViewById(R.id.createEventLayout1);
        createEventLayout2 = (LinearLayout) findViewById(R.id.createEventLayout2);

        createEventLayout3 = (LinearLayout) findViewById(R.id.createEventLayout3);

        createEventLayout4 = (LinearLayout) findViewById(R.id.createEventLayout4);

        createEventLayout5 = (LinearLayout) findViewById(R.id.createEventLayout5);


        createEventText3 = (TextView) findViewById(R.id.createEventText3);

        createEventText4 = (TextView) findViewById(R.id.createEventText4);

        createEventText5 = (TextView) findViewById(R.id.createEventText5);

        createEventText6 = (TextView) findViewById(R.id.createEventText6);
        createEventText7 = (TextView) findViewById(R.id.createEventText7);


        createEventText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createEventLayout1.setVisibility(View.VISIBLE);
                createEventLayout2.setVisibility(View.GONE);
                createEventLayout3.setVisibility(View.GONE);
                createEventLayout4.setVisibility(View.GONE);
                createEventLayout5.setVisibility(View.GONE);
            }
        });


        createEventText4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createEventLayout1.setVisibility(View.GONE);
                createEventLayout2.setVisibility(View.VISIBLE);
                createEventLayout3.setVisibility(View.GONE);
                createEventLayout4.setVisibility(View.GONE);
                createEventLayout5.setVisibility(View.GONE);
            }
        });


        createEventText5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createEventLayout1.setVisibility(View.GONE);
                createEventLayout2.setVisibility(View.GONE);
                createEventLayout3.setVisibility(View.VISIBLE);
                createEventLayout4.setVisibility(View.GONE);
                createEventLayout5.setVisibility(View.GONE);
            }
        });


        createEventText6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createEventLayout1.setVisibility(View.GONE);
                createEventLayout2.setVisibility(View.GONE);
                createEventLayout3.setVisibility(View.GONE);
                createEventLayout4.setVisibility(View.VISIBLE);
                createEventLayout5.setVisibility(View.GONE);
            }
        });


//               createEventText7.setOnContextClickListener(new View.OnContextClickListener() {
//            @Override
//            public boolean onContextClick(View view) {
//
//                createEventLayout1.setVisibility(View.GONE);
//                createEventLayout2.setVisibility(View.GONE);
//                createEventLayout3.setVisibility(View.GONE);
//                createEventLayout4.setVisibility(View.GONE);
//                createEventLayout5.setVisibility(View.VISIBLE);
//////
//
//                return false;
//            }
//        });

        createEventText7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createEventLayout1.setVisibility(View.GONE);
                createEventLayout2.setVisibility(View.GONE);
                createEventLayout3.setVisibility(View.GONE);
                createEventLayout4.setVisibility(View.GONE);
                createEventLayout5.setVisibility(View.VISIBLE);
            }
        });


    }
}