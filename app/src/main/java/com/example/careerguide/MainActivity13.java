package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity13 extends AppCompatActivity {
    public Button pop21;
    public Button pop22;
    public Button pop23;
    public Button pop24;
    public Button popo2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        pop21 = (Button) findViewById(R.id.pop21);
        pop22 = (Button) findViewById(R.id.pop22);
        pop23 = (Button) findViewById(R.id.pop23);
        pop24= (Button) findViewById(R.id.pop24);
        popo2 = (Button) findViewById(R.id.popo2);
        pop21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity13.this, pop21.class);
                startActivity(i);
            }
        });

        pop22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity13.this, pop22.class);
                startActivity(i);
            }
        });

        pop23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity13.this, pop23.class);
                startActivity(i);
            }
        });

        pop24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity13.this, pop24.class);
                startActivity(i);
            }
        });


        popo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity13.this, MainActivityyay.class);
                startActivity(i);
            }
        });
    }
}