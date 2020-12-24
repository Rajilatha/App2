package com.example.learningapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Maths extends AppCompatActivity {
    private long backPressedTime;
    Button logout;
    SharedPreferences loginPreferences;
    SharedPreferences.Editor loginPrefsEditor;
    Intent intentLogin;
    TextView textViewName;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        loginPreferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE);

        user usr = new user();

        usr.name = loginPreferences.getString("username","");




        textViewName = (TextView)findViewById(R.id.textViewName);

        logout = (Button)findViewById(R.id.btnLogout);
        intentLogin = new Intent(Maths.this,LoginActivity.class);

        textViewName.setText(loginPreferences.getString("username",""));

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = loginPreferences.edit();
                editor.clear();
                editor.commit();
                startActivity(intentLogin);

            }
        });

        if (loginPreferences.getString("username","")== null) {

            startActivity(intentLogin);
        }

    }
    public void mathslessons (View view) {
        startActivity(new Intent(this, MathsLesssons.class));
    }
    public void mQuiz (View view) {
        startActivity(new Intent(this, Maths2.class));
    }

    public void mathspastpapers (View view) {
        startActivity(new Intent(this, MathsPastPapers.class));
    }
}