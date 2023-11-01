package com.example.referrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText etusername, etpassword;
        Button btsignin;
        SharedPreferences sharedPreferences;


        private static final String SHARE_NAME ="myPref";
        private static final String KEY_USER = "name";
        private static final String KEY_PW = "password";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etpassword=findViewById(R.id.et_password);
        etusername=findViewById(R.id.et_username);
        btsignin=findViewById(R.id.bt_sign_in);

        sharedPreferences = getSharedPreferences(SHARE_NAME,MODE_PRIVATE);


        String name = sharedPreferences.getString(KEY_USER, null);
        if( name != null){
            Intent intent = new Intent(MainActivity.this, HomeActivity2.class);
            startActivity(intent);
        String password = sharedPreferences.getString(KEY_PW, null);
            if( password != null){
                Intent intent1 = new Intent(MainActivity.this, HomeActivity2.class);
                startActivity(intent1);



        btsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            SharedPreferences.Editor editor= sharedPreferences.edit();
            editor.putString(KEY_USER, etusername.getText().toString());
            editor.putString(KEY_PW, etpassword.getText().toString());
            editor.apply();


                Intent intent = new Intent(MainActivity.this, HomeActivity2.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Da Nhap", Toast.LENGTH_SHORT).show();

            }
        });
    } } }}