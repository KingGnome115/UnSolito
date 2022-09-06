package com.example.unsolito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Menu extends AppCompatActivity {

    MaterialButton btnCalculadora;
    MaterialButton btnImagenes;
    MaterialButton btnPaginasWeb;
    MaterialButton btnVideo;
    MaterialButton btnGPS;
    MaterialButton btnLoco;
    MaterialButton btnAcercaDe;
    MaterialButton btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnCalculadora = findViewById(R.id.btnMenuCalculadora);
        btnImagenes = findViewById(R.id.btnMenuImagen);
        btnPaginasWeb = findViewById(R.id.btnMenuWeb);
        btnVideo = findViewById(R.id.btnMenuVideo);
        btnGPS = findViewById(R.id.btnMenuGPS);
        btnLoco = findViewById(R.id.btnMenuLoco);
        btnAcercaDe = findViewById(R.id.btnMenuAcercaDe);
        btnSalir = findViewById(R.id.btnMenuSalir);

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Calculadora.class);
                startActivity(intent);
            }
        });

    }
}