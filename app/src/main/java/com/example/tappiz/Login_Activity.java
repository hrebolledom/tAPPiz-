package com.example.tappiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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