package com.example.practica_2dialogos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String KEY_FIRST_TIME = "first_time";
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        boolean isFirstTime = sharedPreferences.getBoolean(KEY_FIRST_TIME, true);

        if (isFirstTime) {

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(KEY_FIRST_TIME, false);
            editor.apply();

        }

        Button btnExpositor = findViewById(R.id.btnExpositor);
        Button btnAsistente = findViewById(R.id.btnAsistente);

        btnExpositor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Expositor.class);
                startActivity(intent);
            }
        });

        btnAsistente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Asistente.class);
                startActivity(intent);
            }
        });
    }
}