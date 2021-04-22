package com.poyrazerdogan.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    EditText etEmail;
    EditText etPass;
    EditText etName;
    EditText etConPass;
    AppCompatButton edgesLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etEmail = findViewById(R.id.etRegEmail);
        etPass = findViewById(R.id.etRegPass);
        etName = findViewById(R.id.etRegName);
        etConPass = findViewById(R.id.etConPass);

        edgesLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name, email, pass, conPass;
                name = etName.getText().toString();
                email = etEmail.getText().toString();
                pass = etPass.getText().toString();
                conPass = etConPass.getText().toString();

                if (name.equals("")) {
                    Toast.makeText(Registration.this, "Email Required", Toast.LENGTH_SHORT).show();
                } else if (email.equals("")) {
                    Toast.makeText(Registration.this, "Password Required", Toast.LENGTH_SHORT).show();
                }

                else if (pass.equals("")) {
                    Toast.makeText(Registration.this, "Email Required", Toast.LENGTH_SHORT).show();
                } else if (conPass.equals("")) {
                    Toast.makeText(Registration.this, "Password Required", Toast.LENGTH_SHORT).show();
                }
                else if (!conPass.equals(pass)) {
                    Toast.makeText(Registration.this, "Check Your Passwords, They Don't Match", Toast.LENGTH_SHORT).show();
                }else {
                    //Authentication
                }
            }
        });
    }
}