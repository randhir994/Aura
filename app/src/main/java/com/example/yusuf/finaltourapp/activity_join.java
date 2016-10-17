package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_join extends AppCompatActivity {
    EditText activityJoinText3;
    TextView activityJoinView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_join);

        getSupportActionBar().hide();


        activityJoinText3 =(EditText) findViewById(R.id.activityJoinText3);

        activityJoinView1 = (TextView) findViewById(R.id.activityJoinView1);

        ImageView activityJoinImage4= (ImageView) findViewById(R.id.activityJoinImage4);


        activityJoinText3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if(b){
                    activityJoinView1.setVisibility(View.VISIBLE);

                } else {
                    activityJoinView1.setVisibility(View.GONE);

                }

            }
        });


        activityJoinImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),joining_request_submited.class);
                startActivity(intent);

            }
        });


    }
}
