package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_creation extends AppCompatActivity {

    AnalogClock analogClock;
    CalendarView calendar;
    TextView  activityCreationView1, activityCreationView2, activityCreationView3,activityCreationView4;


    public void goSubmit(View view){

        Intent intent = new Intent(getApplicationContext(),thank_you.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);
        getSupportActionBar().hide();

         analogClock = (AnalogClock) findViewById(R.id.analogClock);

        calendar = (CalendarView) findViewById(R.id.calendar);

        activityCreationView1=(TextView) findViewById(R.id. activityCreationView1);

        activityCreationView2=(TextView) findViewById(R.id. activityCreationView2);

        activityCreationView3 =(TextView) findViewById(R.id. activityCreationView3);

        activityCreationView4 =(TextView) findViewById(R.id. activityCreationView4);



        EditText activityCreationText2 =(EditText) findViewById(R.id.activityCreationText2);

        EditText activityCreationText3 =(EditText) findViewById(R.id.activityCreationText3);

        EditText activityCreationText4 =(EditText) findViewById(R.id.activityCreationText4);

        EditText activityCreationText5 =(EditText) findViewById(R.id.activityCreationText5);

        EditText activityCreationText6 =(EditText) findViewById(R.id.activityCreationText6);

        final Spinner spinner1 = (Spinner) findViewById(R.id.activityCreationSpinner1);

        Spinner spinner2 = (Spinner) findViewById(R.id.activityCreationSpinner2);


        String[] activity_name = new String[]{
                "activity_name",
                "PAINTBALL",
                "BOWLING",
                "POOL",
                "GO KARTING",
                "PLAYSTATION/XBOX"
        };

        String[] location = new String[]{
                "location",
                "AMBIENCE,MALVIYA NAGAR",
                "BAXTERS,CONAUGHT PLACE",
                "CRAWAFORD ZONE,TILAK NAGAR",
                "ELEGANCE FUN ZONE,GTB NAGAR",
                "ROCKSTART UP,GTB NAGAR",
                "PACIFIC MALL,SUBHASH NAGAR",
                "PROMENADE,SOUTH EX"

        };


        final ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<String>(
                this,R.layout.my_creation_filled,activity_name
           );

        ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<String>(
                this,R.layout.my_creation_filled,location
           );


        spinnerArrayAdapter1.setDropDownViewResource(R.layout.my_creation_filled);

//        spinner1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public boolean onHover(View view, MotionEvent motionEvent) {
                spinner1.setAdapter(spinnerArrayAdapter1);

//                return false;
//            }
//        });

          spinnerArrayAdapter2.setDropDownViewResource(R.layout.my_creation_filled);
          spinner2.setAdapter(spinnerArrayAdapter2);




        activityCreationText2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) {
                    activityCreationView1.setVisibility(View.VISIBLE);
                } else{
                    activityCreationView1.setVisibility(View.GONE);
                }
            }
        });


        activityCreationText3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) {
                    activityCreationView2.setVisibility(View.VISIBLE);
                } else{
                    activityCreationView2.setVisibility(View.GONE);
                }
            }
        });

        activityCreationText4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                    if(b){
                        activityCreationView4.setVisibility(View.VISIBLE);
                        calendar.setVisibility(View.VISIBLE);
                    } else {
                        activityCreationView4.setVisibility(View.GONE);
                        calendar.setVisibility(View.GONE);
                    }

            }
        });


        activityCreationText5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

               if(b){
                   activityCreationView3.setVisibility(View.VISIBLE);
                   analogClock.setVisibility(View.VISIBLE);
               } else {

                   activityCreationView3.setVisibility(View.GONE);
                   analogClock.setVisibility(View.GONE);

               }


            }
        });


        activityCreationText6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

            }
        });




    }
}
