package com.example.careerguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    public Button btn7;
    public RadioButton rdb1,rdb2,rdb3,rdb4,rdb5;
    private int flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        rdb1 = (RadioButton) findViewById(R.id.rdb1);
        rdb2 = (RadioButton) findViewById(R.id.rdb2);
        rdb3 = (RadioButton) findViewById(R.id.rdb3);
        rdb4 = (RadioButton) findViewById(R.id.rdb4);
        rdb5 = (RadioButton) findViewById(R.id.rdb5);
        btn7 = (Button) findViewById(R.id.btn7);


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(flag==1){
                    Intent i=new Intent(MainActivity5.this,MainActivity7.class);
                    startActivity(i);
                }
                if(flag==2){
                    Intent i=new Intent(MainActivity5.this,MainActivity8.class);
                    startActivity(i);

                }
                if(flag==3){
                    Intent i=new Intent(MainActivity5.this,MainActivity9.class);
                    startActivity(i);

                }
                if(flag==4){
                    Intent i=new Intent(MainActivity5.this,MainActivity10.class);
                    startActivity(i);

                }
                if(flag==5){
                    Intent i=new Intent(MainActivity5.this,MainActivity11.class);
                    startActivity(i);

                }
            }

        });
    }
    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rdb1 :
                if(checked) {

                    flag = 1;
                }
                break;
            case R.id.rdb2:
                if(checked) {

                    flag = 2;
                }
                break;
            case R.id.rdb3:
                if(checked) {

                    flag = 3;
                }
                break;
            case R.id.rdb4:
                if(checked) {

                    flag = 4;
                }
                break;
            case R.id.rdb5:
                if(checked) {

                    flag = 5;
                }
                break;
        }



    }
}


