package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity32 extends AppCompatActivity {
    public Button btn64;
    public Button btn65;
    public Button btn66;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);
        btn64=(Button) findViewById(R.id.btn64);
        btn65=(Button) findViewById(R.id.btn65);
        btn66=(Button) findViewById(R.id.btn66);

        btn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity32.this,MainActivity60.class);
                startActivity(i);
            }
        });

        btn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity32.this,MainActivity61.class);
                startActivity(i);
            }
        });
        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity32.this,MainActivity62.class);
                startActivity(i);
            }
        });
    }
}