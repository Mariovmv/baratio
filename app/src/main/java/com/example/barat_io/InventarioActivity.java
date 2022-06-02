package com.example.barat_io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class InventarioActivity extends AppCompatActivity {

    private InventarioListAdapter inventarioListAdapter;
    private RecyclerView lstProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);
        inventarioListAdapter = new InventarioListAdapter();
        ArrayList<Producto> productoList = new ArrayList<>();
        productoList.add(new Producto("vd52", "Verdura", "5", "La Granja",
                "Verdura Fresca", 120));
        productoList.add(new Producto("pp33", "Pechuga de Pollo", "55",
                "La Granja", "Pechuga de Pollo", 244));
        inventarioListAdapter.submitList(productoList);
        lstProductos = findViewById(R.id.lstProductos);
        lstProductos.setLayoutManager(new LinearLayoutManager(this));
        lstProductos.setAdapter(inventarioListAdapter);
        inventarioListAdapter.notifyDataSetChanged();
    }
}