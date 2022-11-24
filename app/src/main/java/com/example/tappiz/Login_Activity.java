package com.example.tappiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Login_Activity extends AppCompatActivity {

    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_Activity.this, Registro_Activity.class);
                startActivity(i);
            }
        });

    }
    public void Login (View view){
        Intent Login = new Intent(this, Principal_Activity.class);
        startActivity(Login);
    }

    public void ubicacion (View view){
        Intent ubicacion = new Intent(this, MapsActivity.class);
        startActivity(ubicacion);
    }

}