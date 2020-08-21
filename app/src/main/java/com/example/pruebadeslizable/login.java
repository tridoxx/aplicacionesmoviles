package com.example.pruebadeslizable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         Button siguente;

         siguente=(Button)findViewById(R.id.ingresar);
         siguente.setOnClickListener(new View.OnClickListener(){
             Intent siguente = new Intent(login.this,MainActivity.class);
          public void onClick(View view) {
           startActivity(siguente);
          }
         });

        siguente=(Button)findViewById(R.id.registrarme);
        siguente.setOnClickListener(new View.OnClickListener(){
            Intent siguente = new Intent(login.this,registro.class);
            public void onClick(View view) {
                startActivity(siguente);
            }
        });
        siguente=(Button)findViewById(R.id.RecuperarCuenta);
        siguente.setOnClickListener(new View.OnClickListener(){
            Intent siguente = new Intent(login.this,recuperarCuenta.class);
            public void onClick(View view) {
                startActivity(siguente);
            }
        });
    }
}