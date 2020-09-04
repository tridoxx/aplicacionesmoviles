package com.example.pruebadeslizable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

public class login extends AppCompatActivity {



    private TextView lblGotoRegister;
    private Button btnLogin;
    private EditText inputEmail;
    private EditText inputPassword;
    private TextView loginErrorMsg;






    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         Button siguente;
//login para el usuario
        EditText username = (EditText)findViewById(R.id.txtEmail);
        EditText password = (EditText)findViewById(R.id.txtPass);

//        public void inicio(){
//            siguente=(Button)findViewById(R.id.btnLogin);
//            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
//
//                siguente.setOnClickListener(new View.OnClickListener(){
//                    Intent siguente = new Intent(login.this,MainActivity.class);
//                    public void onClick(View view) {
//                        startActivity(siguente);
//                    }
//                });
//                //correcct password
//            } else {
//                //wrong password
//            }
//            return;
//        }

//fin login


        siguente=(Button)findViewById(R.id.registrarme);
        siguente.setOnClickListener(new View.OnClickListener(){
            Intent siguente = new Intent(login.this,registro.class);
            public void onClick(View view) {
                startActivity(siguente);
            }
        });



                siguente=(Button)findViewById(R.id.btnLogin);
        siguente.setOnClickListener(new View.OnClickListener(){
            Intent siguente = new Intent(login.this,MainActivity.class);
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