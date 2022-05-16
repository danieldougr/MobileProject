package com.aula.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextView valor1Input;
    private TextView valor2Input;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1Input = findViewById(R.id.valor2);
        valor2Input = findViewById(R.id.valor2);

        resultado = findViewById(R.id.resultado);
    }

    public void somar(View v) {
        int valor1 = Integer.parseInt(valor1Input.getText().toString());
        int valor2 = Integer.parseInt(valor2Input.getText().toString());

        resultado.setText(String.valueOf(valor1 + valor2));

    }

    public void subtrair(View v) {
        int valor1 = Integer.parseInt(valor1Input.getText().toString());
        int valor2 = Integer.parseInt(valor2Input.getText().toString());

        resultado.setText(String.valueOf(valor1 - valor2));

    }

    public void dividir(View v) {
        int valor1 = Integer.parseInt(valor1Input.getText().toString());
        int valor2 = Integer.parseInt(valor2Input.getText().toString());

        resultado.setText(String.valueOf(valor1 / valor2));

    }

    public void multiplicar(View v) {
        int valor1 = Integer.parseInt(valor1Input.getText().toString());
        int valor2 = Integer.parseInt(valor2Input.getText().toString());

        resultado.setText(String.valueOf(valor1 * valor2));

    }
}
