package com.example.barat_io;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button salir, iniciar;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        salir = findViewById(R.id.salir);
        iniciar = findViewById(R.id.iniciar);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);

salir.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(LoginActivity.this, "Se cerro la aplicacion", Toast.LENGTH_SHORT).show();
        finish();
    }
});


iniciar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(user.getText().toString().equals("fabian") && pass.getText().toString().equals("fabian123")){
            Intent intent = new Intent(LoginActivity.this, InventarioActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(LoginActivity.this, "Verifique sus credenciales", Toast.LENGTH_SHORT).show();
        }
    }
});

    }
}