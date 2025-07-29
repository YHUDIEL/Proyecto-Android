package com.example.proyectotap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ActivityEjercicio4 extends AppCompatActivity {

    private RadioButton rbtnEfectivo, rbtnTarjeta, rbtnTransferencia;
    private RadioGroup groupPagos;
    private Button btnConfirmar, btnVolver;
    private TextView lblSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        rbtnEfectivo = findViewById(R.id.rbtnEfectivo);
        rbtnTarjeta = findViewById(R.id.rbtnTarjeta);
        rbtnTransferencia = findViewById(R.id.rbtnTransferencia);
        groupPagos = findViewById(R.id.groupPagos);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnVolver = findViewById(R.id.btnVolver);
        lblSeleccion = findViewById(R.id.lblSeleccion);

        btnConfirmar.setOnClickListener(v -> {
            if (rbtnEfectivo.isChecked()) {
                lblSeleccion.setText("Seleccionaste: Efectivo");
            } else if (rbtnTarjeta.isChecked()) {
                lblSeleccion.setText("Seleccionaste: Tarjeta");
            } else if (rbtnTransferencia.isChecked()) {
                lblSeleccion.setText("Seleccionaste: Transferencia");
            } else {
                lblSeleccion.setText("No se seleccionó ningún método de pago.");
            }
        });

        btnVolver.setOnClickListener(v -> finish());
    }
}
