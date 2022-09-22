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

        TextView c1, c2, c3,c4;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pantalla3);

            button = findViewById(R.id.button4);
            c1 = findViewById(R.id.c1);
            c2 = findViewById(R.id.c2);
            c3 = findViewById(R.id.c3);
            c4 = findViewById(R.id.c4);


            DecimalFormat df = new DecimalFormat(".00");
            DecimalFormat df1 = new DecimalFormat("");

            Intent intent = getIntent();
            Bundle extras=getIntent().getExtras();
            float Votosc1 = intent.getFloatExtra("C1", 0);
            float Votosc2 = intent.getFloatExtra("C2", 0);
            float Votosc3 = intent.getFloatExtra("C3", 0);
            float Votosc4 = intent.getFloatExtra("C4", 0);

            c1.setText("Total de votos= "+df1.format(Votosc1));
            c2.setText("Total de votos= "+df1.format(Votosc2));
            c3.setText("Total de votos= "+df1.format(Votosc3));
            c4.setText("Total de votos= "+df1.format(Votosc4));

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), PantallaSalida.class);
                    startActivity(intent);
                }
            });
        }
    }