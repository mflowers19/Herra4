package com.example.herra4_proyecto1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText cedula;
    Button botonlogin;

    String[] eliminar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cedula = findViewById(R.id.plaincedula);
        botonlogin = findViewById(R.id.buttonlogin);


        botonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean flag = false;
                int num = 40;
                for(int i = 0; i < 39; i++) {
                    /** valida que la cedula este en el vector */
                    if (cedula.getText().toString().equals(VariablesGlobales.vectorCedulas[i])) {
                        VariablesGlobales.vectorCedulas[i]=null;
                        flag = true;
                        num = i;
                        break;
                    }

                }
                if (flag){
                    /** al estar la cedula en el vector entra en la actividad */
                    startActivity(new Intent(MainActivity.this, Pantalla2.class));

                    Toast.makeText(MainActivity.this, ("Bienvenido " + VariablesGlobales.vectorNombres[num]), Toast.LENGTH_LONG).show();

            }else{
                    Toast.makeText(MainActivity.this, "Cedula incorrecta o ya voto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}