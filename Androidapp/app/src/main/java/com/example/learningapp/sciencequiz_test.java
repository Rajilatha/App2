package com.example.learningapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sciencequiz_test extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;
    LinearLayout l4;
    LinearLayout l5;
    LinearLayout l6;
    LinearLayout l7;
    LinearLayout l8;
    LinearLayout l9;
    LinearLayout l10;
    LinearLayout l11;
    LinearLayout l12;
    LinearLayout l13;
    LinearLayout l14;
    LinearLayout l15;
    private long backPressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_quiz);

        l1=(LinearLayout) findViewById(R.id.l1);
        l3=(LinearLayout) findViewById( R.id.l3 );
        l2=(LinearLayout) findViewById(R.id.l2);
        l4=(LinearLayout) findViewById( R.id.l4 );
        l5=(LinearLayout) findViewById( R.id.l5 );
        l6=(LinearLayout) findViewById( R.id.l6 );
        l7=(LinearLayout) findViewById(R.id.l7);
        l8=(LinearLayout) findViewById( R.id.l8 );
        l9=(LinearLayout) findViewById(R.id.l9);
        // l10=(LinearLayout) findViewById( R.id.l10 );
        l11=(LinearLayout) findViewById( R.id.l11 );
        l12=(LinearLayout) findViewById( R.id.l12 );
        l13=(LinearLayout) findViewById( R.id.l13 );
        // l14=(LinearLayout) findViewById( R.id.l14 );
        l15=(LinearLayout) findViewById( R.id.l15 );



        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sciencequiz_test.this,Livingtissues2.class);
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
                    startActivity(new Intent(sciencequiz_test.this, Photosynthesis2.class));
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
                    startActivity(new Intent(sciencequiz_test.this, Mixture2.class));
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
                    startActivity(new Intent(sciencequiz_test.this, Waves2.class));
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
                    startActivity(new Intent(sciencequiz_test.this, Geometrical2.class));
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
                    startActivity(new Intent(sciencequiz_test.this, HumanBody2.class));
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
                    startActivity(new Intent(sciencequiz_test.this, Acid2.class));
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
                    startActivity(new Intent(sciencequiz_test.this, Heat2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

        l9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(sciencequiz_test.this, Power_and_Energy2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

       /* l10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Electronics.class);
                startActivity(intent);
            }
        } );*/

        l11.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(sciencequiz_test.this, Electrochemistry2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

        l12.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(sciencequiz_test.this, Electromagnetism2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );


        l13.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(sciencequiz_test.this, Hydrocarbons2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

       /* l14.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Biosphere.class);
                startActivity(intent);
            }
        } );*/

        l15.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int score = intent.getIntExtra("UserScore", 0);
                if(score>75){
                    Toast.makeText(getApplicationContext(), "next quiz", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(sciencequiz_test.this, MixedQuiz2.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "must earn more than 75 marks", Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(sciencequiz_test.this, sciencequiz_test.class));
                }
            }
        } );

    }
    /*public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            Intent intent =new Intent(ScienceQuiz.this,Science.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Press back again to finish", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }*/
}