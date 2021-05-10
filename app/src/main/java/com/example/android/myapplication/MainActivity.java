package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("This should be the one of best apps created by me.");
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(24);
        setContentView(textView);
    }
}