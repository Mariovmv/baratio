package com.example.barat_io;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    Button productos, registro, usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        productos = findViewById(R.id.productos);
        usuarios = findViewById(R.id.usuarios);
        registro = findViewById(R.id.registro);

        productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, productos.class);
                startActivity(intent);
            }
        });

        usuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, Usuarios.class);
                startActivity(intent);
            }
        });

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, Registro.class);
                startActivity(intent);
            }
        });


    }
}