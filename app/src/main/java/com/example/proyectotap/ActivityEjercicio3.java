package com.example.proyectotap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ActivityEjercicio3 extends AppCompatActivity {

    private CheckBox chkFutbol, chkBasquetbol, chkNatacion;
    private TextView lblSeleccion;
    private Button btnMostrar, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        chkFutbol = findViewById(R.id.chkFutbol);
        chkBasquetbol = findViewById(R.id.chkBasquetbol);
        chkNatacion = findViewById(R.id.chkNatacion);
        lblSeleccion = findViewById(R.id.lblSeleccion);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnVolver = findViewById(R.id.btnVolver);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deportes = "Deportes seleccionados: ";

                if (chkFutbol.isChecked()) {
                    deportes += "Fútbol ";
                }
                if (chkBasquetbol.isChecked()) {
                    deportes += "Básquetbol ";
                }
                if (chkNatacion.isChecked()) {
                    deportes += "Natación ";
                }

                if (deportes.equals("Deportes seleccionados: ")) {
                    lblSeleccion.setText("No se seleccionó ningún deporte.");
                } else {
                    lblSeleccion.setText(deportes);
                }
            }
        });

        btnVolver.setOnClickListener(v -> finish());
    }
}
