package com.poyrazerdogan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void loginButton(View view){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
    public void registerButton(View view){
        Intent i = new Intent(this, Registration.class);
        startActivity(i);
    }
}