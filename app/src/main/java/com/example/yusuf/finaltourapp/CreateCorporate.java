package com.example.yusuf.finaltourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class CreateCorporate extends AppCompatActivity {
    public void backButton(View view){
        super.onBackPressed();
    }
String arr[]={"Trade Show","Trade Fair","Annual Meet","Business Dine","Conference","Corporate MEeting","Exhibition","Product Launch","Team Outing/Party","Fashion Show","Walk In Interview"};
   ListView lv;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.corporate_click_1);
        lv=(ListView)findViewById(R.id.listv) ;
        ArrayAdapter ar=new ArrayAdapter(getApplicationContext(),R.layout.custom_list,R.id.textItem,arr);

        lv.setAdapter(ar);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              startActivity(new Intent(CreateCorporate.this,CreateCorporate2.class));

            }
        });
    }
}
