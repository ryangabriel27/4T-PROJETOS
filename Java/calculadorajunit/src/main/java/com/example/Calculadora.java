package com.example;

public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    public double calcularCircunferencia(double r) {
        return 3.14 * 2 * r;
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double raiz(double a, double b) {
        if (b > 0) {
            double raiz = 1 / b;
            if (a < 0 && b % 2 == 0) {
                throw new ArithmeticException();
            } else {
                double resultado = Math.pow(a, raiz);
                return resultado;
            }
        } else {
            throw new IllegalArgumentException("A raiz deve ser maior que 0");
        }
    }
}
