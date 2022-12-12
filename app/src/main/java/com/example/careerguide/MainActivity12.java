package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity12 extends AppCompatActivity {
    public Button pop1;
    public Button pop12;
    public Button pop13;
    public Button pop14;
    public Button popo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        pop1 = (Button) findViewById(R.id.pop1);
        pop12 = (Button) findViewById(R.id.pop12);
        pop13 = (Button) findViewById(R.id.pop13);
        pop14= (Button) findViewById(R.id.pop14);
        popo = (Button) findViewById(R.id.popo);
        pop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity12.this, pop1.class);
                startActivity(i);
            }
        });

        pop12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity12.this, pop12.class);
                startActivity(i);
            }
        });

        pop13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity12.this, pop13.class);
                startActivity(i);
            }
        });

        pop14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity12.this, pop14.class);
                startActivity(i);
            }
        });


        popo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity12.this, MainActivityyay.class);
                startActivity(i);
            }
        });


    }
}

