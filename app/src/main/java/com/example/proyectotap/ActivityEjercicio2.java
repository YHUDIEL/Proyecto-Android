package com.example.proyectotap;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityEjercicio2 extends AppCompatActivity {

    private LinearLayout contenedor;
    private Button btnColor, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        contenedor = findViewById(R.id.contenedor);
        btnColor = findViewById(R.id.btnColor);
        btnVolver = findViewById(R.id.btnVolver);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contenedor.setBackgroundColor(Color.CYAN);
            }
        });

        btnVolver.setOnClickListener(v -> finish());
    }
}
