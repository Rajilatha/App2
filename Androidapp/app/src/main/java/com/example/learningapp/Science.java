package com.example.learningapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Science extends AppCompatActivity {
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
        setContentView(R.layout.activity_science);

        loginPreferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE);

        user usr = new user();

        usr.name = loginPreferences.getString("username","");




        textViewName = (TextView)findViewById(R.id.textViewName);

        logout = (Button)findViewById(R.id.btnLogout);
        intentLogin = new Intent(Science.this,LoginActivity.class);

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
    public void sciencelessons (View view) {
        startActivity(new Intent(this, ScienceLessons.class));
    }
    public void sciencequiz (View view) {
        startActivity(new Intent(this, Science2.class));
    }

    public void sceiencepastpapers (View view) {
        startActivity(new Intent(this, ViewSciencePastPapers.class));
    }

   /* public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            Intent intent =new Intent(Science.this,SelectionActivity.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Press back again to finish", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }*/
}