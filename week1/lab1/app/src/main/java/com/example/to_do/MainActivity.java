package com.example.to_do;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.to_do.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    private String[] tasks = {"Eat", "Sleep", "Code", "Repeat"};
    private TextView textView;
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        textView = findViewById(R.id.result);
            textView.setText(tasks[currentIndex]);
    }

    public void next_click(View view) {
        currentIndex++;
        textView.setText(tasks[currentIndex]);
    }

    public void previous_click(View view) {
    }
}
