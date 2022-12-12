package com.example.careerguide;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity31 extends AppCompatActivity {
    public Button btn61;
    public Button btn62;
    public Button btn63;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main31);
        btn61=(Button) findViewById(R.id.btn61);
        btn62=(Button) findViewById(R.id.btn62);
        btn63=(Button) findViewById(R.id.btn63);

        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity31.this,MainActivity50.class);
                startActivity(i);
            }
        });

        btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity31.this,MainActivity51.class);
                startActivity(i);
            }
        });
        btn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity31.this,MainActivity52.class);
                startActivity(i);
            }
        });
    }
}