package com.example.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {
    public Button btn3;
    public ProgressBar pb1;
    public EditText et1, et2;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn3=(Button) findViewById(R.id.btn3);
        pb1=(ProgressBar) findViewById(R.id.pb1);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        mAuth = FirebaseAuth.getInstance();
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String Email = et1.getText().toString();
                String Password =et2.getText().toString();

                if(TextUtils.isEmpty(Email)) {
                    et1.setError("E-mail is required");
                }
                if(TextUtils.isEmpty(Password)) {
                    et2.setError("Password is required");
                }
                if(Password.length()<8){
                    et2.setError("Password must >= 8 characters!");
                }
                pb1.setVisibility(View.VISIBLE);

                mAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity2.this, "Logged in successfully:) ", Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(MainActivity2.this,MainActivity4.class);
                            startActivity(i);
                        }
                        else {
                            Toast.makeText(MainActivity2.this, "Error occurred" + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            pb1.setVisibility(View.GONE);
                        }
                    }
                });



            }
        });
    }
}