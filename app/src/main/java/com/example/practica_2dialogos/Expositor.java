package com.example.practica_2dialogos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Expositor extends AppCompatActivity {
    private EditText etNombre, etTelefono, etCorreo, etPlatica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expositor);

        etNombre = findViewById(R.id.etNombre);
        etTelefono = findViewById(R.id.etTelefono);
        etCorreo = findViewById(R.id.etCorreo);
        etPlatica = findViewById(R.id.etPlatica);

        Button btnRegistrar = findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los datos ingresados por el expositor
                String nombre = etNombre.getText().toString();
                String telefono = etTelefono.getText().toString();
                String correo = etCorreo.getText().toString();
                String platica = etPlatica.getText().toString();

                Toast.makeText(Expositor.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
