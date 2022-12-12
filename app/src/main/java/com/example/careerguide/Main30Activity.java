package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main30Activity extends AppCompatActivity {
    public Button btn53;
    public Button btn54;
    public Button btn55;
    public Button btn56;
    public Button btn57;
    public Button btn58;
    public Button btn59;
    public Button btn60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main30);
        btn53=(Button) findViewById(R.id.btn53);
        btn54=(Button) findViewById(R.id.btn54);
        btn55=(Button) findViewById(R.id.btn55);
        btn56=(Button) findViewById(R.id.btn56);
        btn57=(Button) findViewById(R.id.btn57);
        btn58=(Button) findViewById(R.id.btn58);
        btn59=(Button) findViewById(R.id.btn59);
        btn60=(Button) findViewById(R.id.btn60);

        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main30Activity.this,MainActivity40.class);
                startActivity(i);
            }
        });

        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main30Activity.this,MainActivity41.class);
                startActivity(i);
            }
        });
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main30Activity.this,MainActivity42.class);
                startActivity(i);
            }
        });
        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main30Activity.this,MainActivity43.class);
                startActivity(i);
            }
        });
        btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main30Activity.this,MainActivity44.class);
                startActivity(i);
            }
        });
        btn58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main30Activity.this,MainActivity45.class);
                startActivity(i);
            }
        });
        btn59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main30Activity.this,MainActivity46.class);
                startActivity(i);
            }
        });
        btn60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main30Activity.this,MainActivity47.class);
                startActivity(i);
            }
        });
    }
}

