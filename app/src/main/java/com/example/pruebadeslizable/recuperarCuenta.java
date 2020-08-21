package com.example.pruebadeslizable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class recuperarCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_cuenta);

        Button siguente;
        siguente=(Button)findViewById(R.id.enviar);
        siguente.setOnClickListener(new View.OnClickListener(){
            Intent siguente = new Intent(recuperarCuenta.this,login.class);
            public void onClick(View view) {
                startActivity(siguente);
            }
        });

    }
}

