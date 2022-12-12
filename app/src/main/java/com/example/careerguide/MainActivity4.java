package com.example.careerguide;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    public Button btn5;
    public Button btn6;
    public Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btn5=(Button) findViewById((R.id.btn5));
        btn6=(Button) findViewById((R.id.btn6));
        logout= (Button) findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity4.this,MainActivity.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent i=new Intent(MainActivity4.this,MainActivity5.class);
                       startActivity(i);
           }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity4.this,MainActivity33.class);
                startActivity(i);
            }
        });
    }
}


