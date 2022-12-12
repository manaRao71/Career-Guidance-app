package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity14 extends AppCompatActivity {
    public Button pop31;
    public Button pop32;
    public Button pop33;
    public Button pop34;
    public Button popo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        pop31 = (Button) findViewById(R.id.pop31);
        pop32 = (Button) findViewById(R.id.pop32);
        pop33 = (Button) findViewById(R.id.pop33);
        pop34= (Button) findViewById(R.id.pop34);
        popo3 = (Button) findViewById(R.id.popo3);
        pop31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity14.this, pop31.class);
                startActivity(i);
            }
        });

        pop32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity14.this, pop32.class);
                startActivity(i);
            }
        });

        pop33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity14.this, pop33.class);
                startActivity(i);
            }
        });

        pop34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity14.this, pop34.class);
                startActivity(i);
            }
        });


        popo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity14.this, MainActivityyay.class);
                startActivity(i);
            }
        });
    }
}