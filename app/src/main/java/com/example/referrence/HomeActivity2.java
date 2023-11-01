package com.example.referrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity2 extends AppCompatActivity {


    TextView username_us;
    TextView password_pw;
    Button thoat;
    SharedPreferences sharedPreferences;


    private static final String SHARE_NAME ="myPref";
    private static final String KEY_USER = "name";
    private static final String KEY_PW = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        username_us = findViewById(R.id.USERNAME);
        password_pw = findViewById(R.id.PASSWORD);
        thoat = findViewById(R.id.button);

        sharedPreferences = getSharedPreferences(SHARE_NAME, MODE_PRIVATE);

        String name = sharedPreferences.getString(KEY_USER, null);
        String password = sharedPreferences.getString(KEY_PW, null);

        if (password != null || name != null) {
            username_us.setText("username: " + name);
            password_pw.setText("password: " + password);
        }

    }
}