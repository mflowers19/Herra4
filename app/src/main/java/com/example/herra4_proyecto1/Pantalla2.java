package com.example.herra4_proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class Pantalla2 extends AppCompatActivity {

    RadioButton r1, r2, r3 ,r4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        button= findViewById(R.id.button2);
        r1= findViewById(R.id.r1);
        r2= findViewById(R.id.r2);
        r3= findViewById(R.id.r3);
        r4= findViewById(R.id.r4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (r1.isChecked() == true) {
                    //float votoc1 = 0;
                   // votoc1 = votoc1 + 1;
                    Intent intent = new Intent(getApplicationContext(), Pantalla3.class);
                    //intent.putExtra("C1", votoc1);
                    startActivity(intent);
                }


                if (r2.isChecked() == true) {
                   // float votoc2 = 0;
                   // votoc2 = votoc2 + 1;
                    Intent intent = new Intent(getApplicationContext(), Pantalla3.class);
                    //intent.putExtra("C2", votoc2);

                    startActivity(intent);
                }

            }
        });

    }
}
