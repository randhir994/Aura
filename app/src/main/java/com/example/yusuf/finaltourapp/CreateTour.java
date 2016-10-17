package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CreateTour extends AppCompatActivity {
EditText shipTitle,startDate,endDate,startFrom,endOn,mode;
    TextView shipInfo,startEndInfo,modeInfo;
    RelativeLayout calender;
    public void tourCreated(View v){
        startActivity(new Intent(CreateTour.this,tour_creation_thank_you.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_tour);
        shipTitle=(EditText)findViewById(R.id.shipTitle);
        startDate=(EditText)findViewById(R.id.startingDate);
        endDate=(EditText)findViewById(R.id.endingDate);
        startFrom=(EditText)findViewById(R.id.startingFrom);
        endOn=(EditText)findViewById(R.id.endOn);
        mode=(EditText)findViewById(R.id.modeOfTravel);
        calender=(RelativeLayout)findViewById(R.id.calenderlayout);
        shipInfo=(TextView)findViewById(R.id.titleInfo);
        startEndInfo=(TextView)findViewById(R.id.startEndInfo);
        modeInfo=(TextView)findViewById(R.id.modeOfTravelInfo);


        shipTitle.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    shipInfo.setVisibility(View.VISIBLE);
                }else {
                    shipInfo.setVisibility(View.GONE);
                }
            }
        });
        startDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    calender.setVisibility(View.VISIBLE);
                }else {
                    calender.setVisibility(View.GONE);
                }
            }
        });
        endDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    calender.setVisibility(View.VISIBLE);
                }else {
                    calender.setVisibility(View.GONE);
                }
            }
        });
        startFrom.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    startEndInfo.setVisibility(View.VISIBLE);
                }else {
                    startEndInfo.setVisibility(View.GONE);
                }
            }
        });
        endOn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    startEndInfo.setVisibility(View.VISIBLE);
                }else {
                    startEndInfo.setVisibility(View.GONE);
                }
            }
        });
        mode.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    modeInfo.setVisibility(View.VISIBLE);
                }else {
                    modeInfo.setVisibility(View.GONE);
                }
            }
        });




    }
}
