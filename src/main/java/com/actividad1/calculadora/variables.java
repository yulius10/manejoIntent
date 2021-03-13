package com.actividad1.calculadora;

import java.util.*;

public class variables {
    public double a,b,resultado;
    public String operador;

    public variables() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public double getResultado() {
        return resultado;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public String getOperador() {
        return operador;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
