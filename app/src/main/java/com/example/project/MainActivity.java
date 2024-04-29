package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myPreferenceRef = getSharedPreferences("My prefs", MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();

        Button buttonToStartSecondActivity = findViewById(R.id.buttonToStartSecondActivity);
        buttonToStartSecondActivity.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View secondview) {
                Intent intent = new Intent(MainActivity.this, second_activity.class);
                startActivity(intent);

            }
        });
    }

    protected void onResume() {
        super.onResume();
        getSharedPreferences("My prefs", MODE_PRIVATE);

    }

}
