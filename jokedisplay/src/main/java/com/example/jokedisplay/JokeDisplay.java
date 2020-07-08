package com.example.jokedisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jokedisplay.ui.jokedisplay.JokeDisplayFragment;

public class JokeDisplay extends AppCompatActivity {

    public static String JOKE_ACTIVITY = "joke_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_display_activity);

    }
}
