package com.example.tappiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class Principal_Activity extends AppCompatActivity {

    public int id;
    public int numImage=0;
    public int maxImage=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button btn_aplicar=findViewById(R.id.btn_aplicar);
        Button btn_siguiente=findViewById(R.id.btn_siguiente);
        Button btn_anterior=findViewById(R.id.btn_anterior);
        ImageView iv_preview=findViewById(R.id.iv_preview);

        iv_preview.setImageResource(R.drawable.x1);

        numImage=1;
        id=R.drawable.x1;

        btn_aplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wp = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wp.setResource(id);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numImage++;
                if (numImage>maxImage)
                    numImage=1;

                id=getResources().getIdentifier("x"+numImage,"drawable",getPackageName());
                iv_preview.setImageResource(id);
            }
        });

        btn_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numImage--;
                if (numImage==0)
                    numImage=6;

                id=getResources().getIdentifier("x"+numImage,"drawable",getPackageName());
                iv_preview.setImageResource(id);
            }
        });

    }
}