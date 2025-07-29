package com.example.proyectotap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ActivityEjercicio5 extends AppCompatActivity {

    private ListView lstCiudades;
    private TextView lblMensaje;
    private Button btnMostrar, btnVolver;

    private String[] ciudades = {
            "Oaxaca", "Puebla", "Monterrey", "CDMX", "Guadalajara"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        lstCiudades = findViewById(R.id.lstCiudades);
        lblMensaje = findViewById(R.id.lblMensaje);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnVolver = findViewById(R.id.btnVolver);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_single_choice,
                ciudades
        );
        lstCiudades.setAdapter(adapter);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = lstCiudades.getCheckedItemPosition();
                if (pos != ListView.INVALID_POSITION) {
                    String ciudad = ciudades[pos];
                    lblMensaje.setText("Seleccionaste: " + ciudad);
                } else {
                    lblMensaje.setText("No se seleccionó alguna ciudad.");
                }
            }
        });

        btnVolver.setOnClickListener(v -> finish());
    }
}
