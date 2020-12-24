package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mathsadmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathsadmin);
    }
    public void mathslessons (View view) {
        startActivity(new Intent(this, AddmathsLesson.class));
    }
    public void mathsquiz (View view) {
        startActivity(new Intent(this, AddmathsQuiz.class));
    }

    public void mathsPastPapers (View view) {
        startActivity(new Intent(this,AddmathsPastpaper.class));
    }
}