package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    private Calculadora calc;

    @Before
    public void setup() {
        calc = new Calculadora();
    }

    @Test
    public void testeSoma() {
        int resultado = calc.soma(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testeSubtracao() {
        int resultado = calc.subtracao(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testeMultiplicacao() {
        int resultado = calc.multiplicacao(2, 3);
        assertEquals(6, resultado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeDivisaoPorZero() {
        calc.divisao(5, 0);
    }

    @Test
    public void testeDivisao() {
        double resultado = calc.divisao(5, 2);
        assertEquals(2.5, resultado, 0.1);
    }

    @Test
    public void testeRaiz() {
        double resultado = calc.raiz(625, 4);
        assertEquals(5, resultado, 0.1);
    }

    @Test(expected = ArithmeticException.class)
    public void testeRaizNegativa() {
        calc.raiz(-16, 2);
    }

    @Test
    public void testerCirculo() {
        double resultado = calc.calcularCircunferencia(2);
        assertEquals(12.5, resultado, 0.1);
    }

    @Test
    public void testePotencia() {

    }
}
