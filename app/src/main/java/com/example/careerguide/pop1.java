package com.example.careerguide;

import android.os.Bundle;
import android.util.DisplayMetrics;

import androidx.appcompat.app.AppCompatActivity;


public class pop1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop1);

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
         int width =dm.widthPixels;
         int height=dm.heightPixels;

         getWindow().setLayout((int)(width*.9),(int)(height*.7));

    }
}