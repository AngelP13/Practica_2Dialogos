package com.example.practica_2dialogos;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Asistente extends AppCompatActivity {
    private Spinner spinnerConferencias;
    private Button btnRegistrarAsistente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistente);

        spinnerConferencias = findViewById(R.id.spinnerConferencias);
        btnRegistrarAsistente = findViewById(R.id.btnRegistrarAsistente);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.conferencias_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerConferencias.setAdapter(adapter);

        btnRegistrarAsistente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String conferencia = spinnerConferencias.getSelectedItem().toString();

                Toast.makeText(Asistente.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
