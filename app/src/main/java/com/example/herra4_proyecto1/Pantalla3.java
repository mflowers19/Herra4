package com.example.herra4_proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;


public class Pantalla3 extends AppCompatActivity {
        Button button;

        TextView c1, c2, c3, vb;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pantalla3);

            button = findViewById(R.id.button4);
            c1 = findViewById(R.id.c1);
            c2 = findViewById(R.id.c2);
            c3 = findViewById(R.id.c3);
            vb= findViewById(R.id.vb);


            c1.setText("Total de votos= "+VariablesGlobales.votoc1/ 0.4 +"%");
            c2.setText("Total de votos= "+VariablesGlobales.votoc2/ 0.4 +"%");
            c3.setText("Total de votos= "+VariablesGlobales.votoc3/ 0.4 +"%");
            vb.setText("Total de votos= "+VariablesGlobales.votoB/ 0.4 +"%");



            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), PantallaSalida.class);
                    startActivity(intent);
                }
            });
        }
    }