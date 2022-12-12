package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {
    public Button btn50;
    public Button btn51;
    public Button btn52;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btn50=(Button) findViewById(R.id.btn50);
        btn51=(Button) findViewById(R.id.btn51);
        btn52=(Button) findViewById(R.id.btn52);
        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,Main30Activity.class);
                startActivity(i);
            }
        });

        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,MainActivity31.class);
                startActivity(i);
            }
        });
        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,MainActivity32.class);
                startActivity(i);
            }
        });
    }
}

