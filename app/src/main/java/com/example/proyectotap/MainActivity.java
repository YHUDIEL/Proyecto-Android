package com.example.proyectotap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button[] botones = new Button[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 10; i++) {
            String buttonID = "btnEj" + (i + 1);
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            botones[i] = findViewById(resID);

            int finalI = i + 1;
            botones[i].setOnClickListener(view -> {
                try {
                    Class<?> clase = Class.forName("com.example.proyectotap.ActivityEjercicio" + finalI);
                    Intent intent = new Intent(MainActivity.this, clase);
                    startActivity(intent);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
