package com.actividad1.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnUno = findViewById(R.id.btnUno);
        final Button btnDos = findViewById(R.id.btnDos);
        final Button btnTres = findViewById(R.id.btnTres);
        final Button btnCuatro = findViewById(R.id.btnCuatro);
        final Button btnCinco = findViewById(R.id.btnCinco);
        final Button btnSeis = findViewById(R.id.btnSeis);
        final Button btnSiete = findViewById(R.id.btnSiete);
        final Button btnOcho = findViewById(R.id.btnOcho);
        final Button btnNueve = findViewById(R.id.btnNueve);
        final Button btnCero = findViewById(R.id.btnCero);
        final Button btnPunto = findViewById(R.id.btnPunto);
        final Button btnComa = findViewById(R.id.btnComa);
        final Button btnDividir = findViewById(R.id.btnDividir);
        final Button btnMas = findViewById(R.id.btnMas);
        final Button btnMenos = findViewById(R.id.btnMenos);
        final Button btnPor = findViewById(R.id.BtnPor);
        final Button btnBorrar = findViewById(R.id.btnBorrar);
        final Button btnIgual = findViewById(R.id.btnIgual);
        TextView txtArea = findViewById(R.id.txtInput);
        final TextView txtPrevisualizado = findViewById(R.id.txtPrevisualizado);

        variables objVariable = new variables();
        metodos objMetodos = new metodos();

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText("");
                txtPrevisualizado.setText("");
                objVariable.setOperador("");
                objVariable.setResultado(0.0);
                objVariable.setB(0.0);
                objVariable.setA(0.0);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(objVariable.getA() == 0.0){
                    objVariable.setA(Double.parseDouble(txtArea.getText().toString()));
                    txtPrevisualizado.setText(txtArea.getText().toString() + "/" + txtPrevisualizado.getText());
                    txtArea.setText("");
                }
                else if(objVariable.getB() == 0.0){
                    objVariable.setB(Double.parseDouble(txtArea.getText().toString()));
                    txtPrevisualizado.setText(txtArea.getText().toString() + "/" + txtPrevisualizado.getText());
                    txtArea.setText("");
                }
                else{
                    txtPrevisualizado.setText("Ya existen dos valores para hacer la operacion");
                }
                objVariable.setOperador("/");
            }
        });

        btnMas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(objVariable.getA() == 0.0){
                    objVariable.setA(Double.parseDouble(txtArea.getText().toString()));
                    txtPrevisualizado.setText(txtArea.getText().toString() + "+" + txtPrevisualizado.getText());
                    txtArea.setText("");
                }
                else if(objVariable.getB() == 0.0){
                    objVariable.setB(Double.parseDouble(txtArea.getText().toString()));
                    txtPrevisualizado.setText(txtArea.getText().toString() + "+" + txtPrevisualizado.getText());
                    txtArea.setText("");
                }
                else{
                    txtPrevisualizado.setText("Ya existen dos valores para hacer la operacion");
                }
                objVariable.setOperador("+");
            }
        });

        btnPor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(objVariable.getA() == 0.0){
                    objVariable.setA(Double.parseDouble(txtArea.getText().toString()));
                    txtPrevisualizado.setText(txtArea.getText().toString() + "*" + txtPrevisualizado.getText());
                    txtArea.setText("");
                }
                else if(objVariable.getB() == 0.0){
                    objVariable.setB(Double.parseDouble(txtArea.getText().toString()));
                    txtPrevisualizado.setText(txtArea.getText().toString() + "*" + txtPrevisualizado.getText());
                    txtArea.setText("");
                }
                else{
                    txtPrevisualizado.setText("Ya existen dos valores para hacer la operacion");
                }
                objVariable.setOperador("*");
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(objVariable.getA() == 0.0){
                    objVariable.setA(Double.parseDouble(txtArea.getText().toString()));
                    txtPrevisualizado.setText(txtArea.getText().toString() + "-" + txtPrevisualizado.getText());
                    txtArea.setText("");
                }
                else if(objVariable.getB() == 0.0){
                    objVariable.setB(Double.parseDouble(txtArea.getText().toString()));
                    txtPrevisualizado.setText(txtArea.getText().toString() + "-" + txtPrevisualizado.getText());
                    txtArea.setText("");
                }
                else{
                    txtPrevisualizado.setText("Ya existen dos valores para hacer la operacion");
                }
                objVariable.setOperador("-");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (objVariable.getOperador()){
                    case "+":
                        txtPrevisualizado.setText(txtPrevisualizado.getText()+txtArea.getText().toString());
                        objVariable.setResultado(objMetodos.getSuma(objVariable.getA(),Double.parseDouble(txtArea.getText().toString())));
                        break;
                    case "-":
                        txtPrevisualizado.setText(txtPrevisualizado.getText()+txtArea.getText().toString());
                        objVariable.setResultado(objMetodos.getResta(objVariable.getA(),Double.parseDouble(txtArea.getText().toString())));
                        break;
                    case "*":
                        txtPrevisualizado.setText(txtPrevisualizado.getText()+txtArea.getText().toString());
                        objVariable.setResultado(objMetodos.getMultiplicacion(objVariable.getA(),Double.parseDouble(txtArea.getText().toString())));
                        break;
                    case "/":
                        txtPrevisualizado.setText(txtPrevisualizado.getText()+txtArea.getText().toString());
                        objVariable.setResultado(objMetodos.getDivision(objVariable.getA(),Double.parseDouble(txtArea.getText().toString())));
                        break;
                }
                txtArea.setText(objVariable.getResultado()+"");
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"1");
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"2");
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"3");
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"4");
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"5");
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"6");
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"7");
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"8");
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"9");
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtArea.setText(txtArea.getText()+"0");
            }
        });
    }


}