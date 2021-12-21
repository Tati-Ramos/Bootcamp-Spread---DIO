package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {

    @Test
    public void deveSomarDoisValores(){
        int valorA = 1;
        int valorB = 2;

        CalculadoraNova cal = new CalculadoraNova();
        int soma = cal.somar(valorA, valorB);

        assertEquals(3, soma);

    }

}
