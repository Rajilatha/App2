package com.example.learningapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class Game extends AppCompatActivity {
    final public static String TAG = "Game";
    Button startButton;
    Button startButton2;
    Button startButton3;

    private ConstraintLayout mainLayout;
    private Context mContext;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        i=0;

        startButton = findViewById(R.id.StartButton);
        startButton2 = findViewById(R.id.StartButton2);
        startButton3 = findViewById(R.id.StartButton3);


        mainLayout = findViewById(R.id.MainLayout);
        mContext = getApplicationContext();

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, WordSearchActivity.class);
                startActivity(intent);
            }
        });
        startButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, WordSearchActivity2.class);
                startActivity(intent);
            }
        });

        startButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, WordSearchActivity3.class);
                startActivity(intent);
            }
        });


    }
}
