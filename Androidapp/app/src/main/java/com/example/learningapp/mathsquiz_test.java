package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class mathsquiz_test extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;
    LinearLayout l4;
    LinearLayout l5;
    LinearLayout l6;
    LinearLayout l7;
    LinearLayout l8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_quiz);

        l1=(LinearLayout) findViewById(R.id.l1);
        l3=(LinearLayout) findViewById( R.id.l3 );
        l2=(LinearLayout) findViewById(R.id.l2);
        l4=(LinearLayout) findViewById( R.id.l4 );
        l5=(LinearLayout) findViewById( R.id.l5 );
        l6=(LinearLayout) findViewById( R.id.l6 );
        l7=(LinearLayout) findViewById(R.id.l7);
        l8=(LinearLayout) findViewById( R.id.l8 );

        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mathsquiz_test.this,RealNumber2.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(mathsquiz_test.this, Binomial2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }

            }
        } );


        l3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(mathsquiz_test.this, Aigebraic2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

        l4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(mathsquiz_test.this, Percentage2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

        l5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(mathsquiz_test.this, ShareMarket2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );


        l6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(mathsquiz_test.this, Equations2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

        l7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(mathsquiz_test.this, DataRepresentation2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

        l8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(mathsquiz_test.this, Geometric2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

    }
}