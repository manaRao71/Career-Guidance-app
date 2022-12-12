package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity33 extends AppCompatActivity {

    public Button btn53;
    public Button btn54;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);
        btn53=(Button) findViewById(R.id.btn53);
        btn54=(Button) findViewById(R.id.btn54);

        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity33.this,MainActivity34.class);
                startActivity(i);
            }
        });

        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity33.this,MainActivity6.class);
                startActivity(i);
            }
        });

    }
}