package com.example.proyectotap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityEjercicio1 extends AppCompatActivity {

    private TextView lblTexto;
    private Button btnActualizar, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        lblTexto = findViewById(R.id.lblTexto);
        btnActualizar = findViewById(R.id.btnActualizar);
        btnVolver = findViewById(R.id.btnVolver);

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblTexto.setText("Mensaje actualizado!!!");
            }
        });

        btnVolver.setOnClickListener(v -> finish()); // Regresa al menú principal
    }
}
