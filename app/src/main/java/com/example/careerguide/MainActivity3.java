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

import java.util.regex.Pattern;

public class MainActivity3 extends AppCompatActivity {
    public Button btn4;
    public EditText et3, et4, et5;
    public ProgressBar pb2;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        pb2 = (ProgressBar) findViewById(R.id.pb2);
        btn4 = (Button) findViewById(R.id.btn4);
        mAuth = FirebaseAuth.getInstance();

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = et3.getText().toString();
                String Email = et4.getText().toString();
                String Password = et5.getText().toString();
                if (TextUtils.isEmpty(Username)) {
                    et3.setError("Username is required");
                }
                if (TextUtils.isEmpty(Email)) {
                    et4.setError("E-mail is required");
                }
                if (TextUtils.isEmpty(Password)) {
                    et5.setError("Password is required");
                }
                if (Password.length() < 8) {
                    et5.setError("Password must >= 8 characters!");
                }
                if (!isValidPassword(Password)) {
                    Toast.makeText(MainActivity3.this, "Password Does not match the rules", Toast.LENGTH_LONG).show();
                    return;
                }
                pb2.setVisibility(View.VISIBLE);
                mAuth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Toast.makeText(MainActivity3.this, "User registered", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(MainActivity3.this, MainActivity4.class);
                            startActivity(i);

                        } else {
                            Toast.makeText(MainActivity3.this, "Error occurred" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            pb2.setVisibility(View.GONE);
                        }
                    }
                });


            }

        });
    }
    Pattern lowercase = Pattern.compile("^.*[a-z].*$");
    Pattern uppercase = Pattern.compile("^.*[A-Z].*$");
    Pattern number = Pattern.compile("^.*[0-9].*$");
    Pattern specialCharacter = Pattern.compile("^.*[^a-zA-Z0-9].*$");




    private boolean isValidPassword(String Password) {
        if (!lowercase.matcher(Password).matches()) {
            return false;
        }
        if (!uppercase.matcher(Password).matches()) {
            return false;
        }
        if (!number.matcher(Password).matches()) {
            return false;
        }
        if (!specialCharacter.matcher(Password).matches()) {
            return false;
        }
        return true;
    }
}




