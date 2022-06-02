package com.example.barat_io;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class InventarioListAdapter extends ListAdapter<Producto, InventarioListAdapter.InventarioListHolder> {

    protected InventarioListAdapter() {
        super(Producto.itemCallback);
    }

    @NonNull
    @Override
    public InventarioListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull InventarioListHolder holder, int position) {

    }

    class InventarioListHolder extends RecyclerView.ViewHolder{

        public InventarioListHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
