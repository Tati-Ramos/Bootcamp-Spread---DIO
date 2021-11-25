package com.projeto.fila;

/*
na fila “o primeiro que entra é o primeiro que sai” (a sigla FIFO – first in, first out – é usada para descrever essa estratégia).

A ideia fundamental da fila é que só podemos inserir um novo elemento no final da fila e só podemos retirar o elemento do início.
 */

public class Fila<T> {

    private No<T> refNoEntradaFila = null;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void  enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if (!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }


    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{Objeto=" + noAuxliar.getObject() +"}] ---> ";
                if (noAuxliar.getRefNo() != null){
                    noAuxliar = noAuxliar.getRefNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
