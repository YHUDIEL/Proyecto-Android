package com.example.proyectotap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText txtCorreo, txtContraseña;
    TextView lblErrorCorreo, lblErrorContraseña;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Referencias a los elementos del layout
        txtCorreo = findViewById(R.id.txtCorreo);
        txtContraseña = findViewById(R.id.txtContraseña);
        lblErrorCorreo = findViewById(R.id.lblErrorCorreo);
        lblErrorContraseña = findViewById(R.id.lblErrorContraseña);
        btnIngresar = findViewById(R.id.btnIngresar);

        // Ocultar errores al iniciar
        lblErrorCorreo.setVisibility(View.GONE);
        lblErrorContraseña.setVisibility(View.GONE);

        btnIngresar.setOnClickListener(view -> {
            String correo = txtCorreo.getText().toString().trim();
            String contra = txtContraseña.getText().toString().trim();

            boolean valido = true;

            // Validar correo
            if (!correo.equals("tap2025@example.com")) {
                lblErrorCorreo.setText("Correo incorrecto");
                lblErrorCorreo.setVisibility(View.VISIBLE);
                valido = false;
            } else {
                lblErrorCorreo.setVisibility(View.GONE);
            }

            // Validar contraseña
            if (!contra.equals("tap*2025")) {
                lblErrorContraseña.setText("Contraseña incorrecta");
                lblErrorContraseña.setVisibility(View.VISIBLE);
                valido = false;
            } else {
                lblErrorContraseña.setVisibility(View.GONE);
            }

            // Si ambas credenciales son correctas, abre MainActivity
            if (valido) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Opcional: evita regresar al login
            }
        });
    }
}
