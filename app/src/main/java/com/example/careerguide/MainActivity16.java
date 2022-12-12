package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity16 extends AppCompatActivity {
    public Button pop51;
    public Button pop52;
    public Button pop53;
    public Button pop54;
    public Button popo5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        pop51 = (Button) findViewById(R.id.pop51);
        pop52 = (Button) findViewById(R.id.pop52);
        pop53 = (Button) findViewById(R.id.pop53);
        pop54= (Button) findViewById(R.id.pop54);
        popo5 = (Button) findViewById(R.id.popo5);
        pop51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity16.this, pop51.class);
                startActivity(i);
            }
        });

        pop52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity16.this, pop52.class);
                startActivity(i);
            }
        });

        pop53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity16.this, pop53.class);
                startActivity(i);
            }
        });

        pop54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity16.this, pop54.class);
                startActivity(i);
            }
        });


        popo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity16.this, MainActivityyay.class);
                startActivity(i);
            }
        });
    }
}