package com.projeto.pilha;

/*
Uma pilha é um conjunto ordenado de itens, no qual novos itens podem ser inseridos e a partir do qual podem ser eliminados itens de uma extremidade, chamada topo da pilha.
Também é chamada de lista linear, onde todas as inserções e eliminações são feitas em apenas uma das extremidades, chamada topo.

A estrutura de dados em pilha tem como característica que a última informação a entrar é a primeira a sair (LIFO - last in first out).
 */

public class NoPilha {

    private int dado;
    private NoPilha refNo = null;

    public NoPilha() {
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getRefNo() {
        return refNo;
    }

    public void setRefNo(NoPilha refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}


