package com.example.todo_detail;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class todo_detail extends AppCompatActivity {
    private String[] todo_description;
    private TextView textView;
    private Button backButton;
    public static String TodoIndex = "com.example.todo_detail";
    int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_detail);

        final Intent intent = getIntent();
        intent.getIntExtra (MainActivity.TodoIndex,0);
        textView = findViewById(R.id.text_View);
        Resources res = getResources();
        todo_description = res.getStringArray(R.array.todo_description);
        int CurrentIndex = getIntent().getIntExtra(MainActivity.TodoIndex,0);
        textView = findViewById(R.id.text_View);
        textView.setText(todo_description[CurrentIndex]);

        backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(todo_detail.this, MainActivity.class);
                intent.putExtra(TodoIndex, currentIndex);
                startActivity(intent);
            }
        });
    }
}
