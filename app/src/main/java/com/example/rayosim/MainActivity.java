package com.example.rayosim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    Button btn_ingreso_operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ingreso_operador=(Button)findViewById(R.id.btn_ingreso_operador);

        btn_ingreso_operador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_ingreso_operador = new Intent(MainActivity.this, IngresarOperador.class);
                startActivity(btn_ingreso_operador);
            }
        });
    }
}