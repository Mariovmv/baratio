package com.example.barat_io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class InventarioActivity extends AppCompatActivity {

    private InventarioListAdapter inventarioListAdapter;
    private RecyclerView lstProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);
        inventarioListAdapter = new InventarioListAdapter();
        lstProductos = findViewById(R.id.lstProductos);
        lstProductos.setAdapter(inventarioListAdapter);
    }
}