package com.example.airmusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.airmusic.adapter.adap;

public class AirF extends AppCompatActivity {
String s1[],s2[];
int info[] = {R.drawable.sw,R.drawable.sw,R.drawable.sw,R.drawable.sw,R.drawable.sw};
RecyclerView rv;
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_f);
        rv = findViewById(R.id.rv1);
        s1 = getResources().getStringArray(R.array.Music);
        tv1 = findViewById(R.id.textView);
        adap myadap = new adap(this,s1,info,tv1);
        rv.setAdapter(myadap);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }
}