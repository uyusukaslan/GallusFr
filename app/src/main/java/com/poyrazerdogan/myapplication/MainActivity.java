package com.poyrazerdogan.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();
        //ft.add(R.id.Login_Menu_Top, new Login_Menu_Top(), "Menu");
        ft.add(R.id.Login_Main, new Login_Menu_Main(), "Main");
        ft.commit();
    }

}