package com.example.unsolito;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

        btnImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Imagenes.class);
                startActivity(intent);
            }
        });

        btnPaginasWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Web.class);
                startActivity(intent);
            }
        });

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Video.class);
                startActivity(intent);
            }
        });

        btnGPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,GPS_maps.class);
                startActivity(intent);
            }
        });

        btnLoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Loco.class);
                startActivity(intent);
            }
        });

        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCreditos();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Menu.this, "Bye bye", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });

    }

    private void getCreditos() {
        new AlertDialog.Builder(this)
                .setTitle("Acerca de")
                .setMessage(""+
                        "Kevin Jesús Escutia Ceja\n"
                        + "Profesora: Rocio Elizabeth Alba\n"
                        + "Movil 2022B\n"
                        + "vrs 1")
                .setPositiveButton("Aceptar",null)
                .show();
    }
}