package com.example.proyectotap;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio6 extends AppCompatActivity {

    private SeekBar sldVolumen;
    private TextView lblMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        sldVolumen = findViewById(R.id.sldVolumen);
        lblMensaje = findViewById(R.id.lblMensaje);

        actualizarMensaje(sldVolumen.getProgress());

        sldVolumen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                actualizarMensaje(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // No necesario
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // No necesario
            }
        });
    }

    private void actualizarMensaje(int valor) {
        if (valor == 0) {
            lblMensaje.setText("Volumen: Silencio");
        } else {
            lblMensaje.setText("Volumen: " + valor + "%");
        }
    }
}
