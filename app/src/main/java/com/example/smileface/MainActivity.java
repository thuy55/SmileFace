package com.example.smileface;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public  class MainActivity extends AppCompatActivity {
        Button btnSignIn,btnRegister;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnSignIn=findViewById(R.id.btnSignin);
            btnSignIn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            btnSignIn = findViewById(R.id.btnSignin);
            btnSignIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     startActivity(new Intent(MainActivity.this,Sign.class));
                }
            });
        }
        });

        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,Register.class));
        }
        });
        }

        }