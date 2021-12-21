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


/*
O que vem a ser a sigla TDD?

TDD é uma sigla para Test Driven Development, ou Desenvolvimento Orientado a Testes. A ideia do TDD é que você trabalhe em ciclos. Estes ciclos ocorrem na seguinte ordem:

Primeiro, escreva um teste unitário que inicialmente irá falhar, tendo em vista que o código ainda não foi implementado;
Crie o código que satisfaça esse teste, ou seja: implemente a funcionalidade em questão. Essa primeira implementação deverá satisfazer imediatamente o teste que foi escrito no ciclo anterior;
Quando o código estiver implementado e o teste satisfeito, refatore o código para melhorar pontos como legibilidade. Logo após, execute o teste novamente. A nova versão do código também deverá passar sem que seja necessário modificar o teste escrito inicialmente.
 */