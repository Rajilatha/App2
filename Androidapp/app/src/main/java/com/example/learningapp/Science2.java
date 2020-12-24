package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Science2 extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science2);
        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Science2.this, ScienceQuiz.class);
                startActivity(intent);
            }
        });

        l2.setOnClickListener( new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Science2.this,sciencequiz_test.class);
            startActivity(intent);
        }
    } );
    }
}