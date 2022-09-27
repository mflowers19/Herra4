package com.example.herra4_proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Pantalla2 extends AppCompatActivity {

    RadioButton r1, r2, r3, r4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        button= findViewById(R.id.button);
        r1= findViewById(R.id.r1);
        r2= findViewById(R.id.r2);
        r3= findViewById(R.id.r3);
        r4= findViewById(R.id.r4);


       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1.isChecked() == true) {
                    VariablesGlobales.votoc1 =  VariablesGlobales.votoc1 + 1;
                    Intent intent = new Intent(getApplicationContext(), Pantalla3.class);
                    intent.putExtra("C1", VariablesGlobales.votoc1);
                    startActivity(intent);
                }


                if (r2.isChecked() == true) {
                    VariablesGlobales.votoc2 =  VariablesGlobales.votoc2 + 1;
                    Intent intent = new Intent(getApplicationContext(), Pantalla3.class);
                    intent.putExtra("C2",  VariablesGlobales.votoc2);
                    startActivity(intent);
                }

                if (r3.isChecked() == true) {
                    VariablesGlobales.votoc3 =  VariablesGlobales.votoc3 + 1;
                    Intent intent = new Intent(getApplicationContext(), Pantalla3.class);
                    intent.putExtra("C3",  VariablesGlobales.votoc3);
                    startActivity(intent);
                }

                if (r4.isChecked() == true) {
                    VariablesGlobales.votoB =  VariablesGlobales.votoB + 1;
                    Intent intent = new Intent(getApplicationContext(), Pantalla3.class);
                    intent.putExtra("VB",  VariablesGlobales.votoB);
                    startActivity(intent);
                }

                if (r1.isChecked()==false && r2.isChecked() == false && r3.isChecked()==false && r4.isChecked()==false){
                    Toast.makeText(getApplicationContext(), "Debe seleccionar un candidato", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
