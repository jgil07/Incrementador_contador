package com.example.lds.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button click;
    private TextView TextViewcontador;

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewcontador = (TextView) findViewById(R.id.TextView);
        click = (Button) findViewById(R.id.buttonclick);
        click.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                contador++;

                TextViewcontador.setText("Contador:" + contador);

            }
        });

    }
}
