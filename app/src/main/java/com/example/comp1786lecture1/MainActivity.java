package com.example.comp1786lecture1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call the textView helloWorld in layout
        TextView helloWorld = findViewById(R.id.helloWorldText);

        // Generate a random number from 0 - 100
        int mark = 0;
        Random r = new Random();
        mark = r.nextInt(100);
        mark++;

        // Append the random number to the current text

        helloWorld.setText("Hello world");
        helloWorld.append("\nYour mark is " + mark);
        if (mark > 50){
            helloWorld.append("\nYou are the winner");
        }
        else {
            helloWorld.append("\nYou are the loser");
        }

    }
}