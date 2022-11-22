package com.example.tappiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Activity.this, Registro_Activity.class);
                startActivity(intent);
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