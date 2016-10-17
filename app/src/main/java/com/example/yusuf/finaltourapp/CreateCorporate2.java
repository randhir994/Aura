package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CreateCorporate2 extends AppCompatActivity {
    public void backButton(View view){
        super.onBackPressed();
    }
    LinearLayout calender,nopicker;
    EditText most,other;
    ImageView save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.corporate_click_2);
        calender=(LinearLayout)findViewById(R.id.calenderlayout);
        nopicker=(LinearLayout)findViewById(R.id.nopicker);
        most=(EditText)findViewById(R.id.mostLocation);
        save=(ImageView)findViewById(R.id.save);
        other=(EditText)findViewById(R.id.otherLocation);
        most.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    calender.setVisibility(View.VISIBLE);
                }else{
                    calender.setVisibility(View.GONE);
                }
            }
        });
        other.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    nopicker.setVisibility(View.VISIBLE);
                }else{
                    nopicker.setVisibility(View.GONE);
                }
            }
        });


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateCorporate2.this,CreateCorporate3.class));
            }
        });

    }
}
