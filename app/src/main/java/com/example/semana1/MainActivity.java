package com.example.semana1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView loginTitle;
    private ImageView loginLogo;
    private TextView loginUsername;
    private TextView loginPassword;
    private Button loginIniciarsesion;

    //primer metodo que se ejecuta en una actividad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciar

        loginTitle = findViewById(R.id.loginTitle);
        loginLogo = findViewById(R.id.loginLogo);
        loginUsername = findViewById(R.id.loginUsername);
        loginPassword = findViewById(R.id.loginPassword);
        loginIniciarsesion = findViewById(R.id.loginIniciarsesion);


        loginIniciarsesion.setOnClickListener(

                (v) -> {

                    //aqui va mi accion

                    String username = loginUsername.getText().toString();
                    String password = loginPassword.getText(). toString();
                    Toast.makeText( this, username + " " + password, Toast.LENGTH_LONG).show();

                    //Toast.makeText( context: this, resid: username + " " + password, Toast.LENGTH_LONG).show();

                }
        );

    }
}