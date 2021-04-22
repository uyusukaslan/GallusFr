package com.poyrazerdogan.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText etEmail;
    EditText etPass;
    AppCompatButton edgesLogin;
    AppCompatButton tvReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
/*
        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);

        edgesLogin = findViewById(R.id.Login_Button);
        tvReg = findViewById(R.id.Register_Button);

        edgesLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email, pass;
                email = etEmail.getText().toString();
                pass = etPass.getText().toString();

                if (email.equals("")) {
                    Toast.makeText(MainActivity.this, "Email Required", Toast.LENGTH_SHORT).show();
                } else if (pass.equals("")) {
                    Toast.makeText(MainActivity.this, "Password Required", Toast.LENGTH_SHORT).show();
                } else {
                    //Authentication
                }
            }
        });*/
    }}