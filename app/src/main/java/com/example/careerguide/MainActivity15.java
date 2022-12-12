package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity15 extends AppCompatActivity {
    public Button pop41;
    public Button pop42;
    public Button pop43;
    public Button pop44;
    public Button popo4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        pop41 = (Button) findViewById(R.id.pop41);
        pop42 = (Button) findViewById(R.id.pop42);
        pop43 = (Button) findViewById(R.id.pop43);
        pop44= (Button) findViewById(R.id.pop44);
        popo4 = (Button) findViewById(R.id.popo4);
        pop41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity15.this, pop41.class);
                startActivity(i);
            }
        });

        pop42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity15.this, pop42.class);
                startActivity(i);
            }
        });

        pop43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity15.this, pop43.class);
                startActivity(i);
            }
        });

        pop44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity15.this, pop44.class);
                startActivity(i);
            }
        });


        popo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity15.this, MainActivityyay.class);
                startActivity(i);
            }
        });

    }
}