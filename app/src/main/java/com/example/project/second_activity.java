package com.example.project;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class second_activity extends AppCompatActivity {
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText editText = findViewById(R.id.settingseditview);
        Button saveButton = findViewById(R.id.saveButton);

        myPreferenceRef = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                myPreferenceEditor.putString("MyPreferenceString", text);
                myPreferenceEditor.apply();

            }
        });
    }
}
