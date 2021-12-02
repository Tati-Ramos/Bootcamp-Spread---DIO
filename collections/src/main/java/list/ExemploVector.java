package list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        //adiciona elementos no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        System.out.println("----------\tOrdem de inserção:\t------------- ");
        System.out.println(esportes);

        // Altera o valor da posição 2 do vetor
        System.out.println("----------\tAlteração do vetor:\t------------- ");
        esportes.set(2,"Ping-Pong");
        System.out.println(esportes);

        // Remove o esporte
        System.out.println("----------\tRemovendo um elemento:\t------------- ");
        esportes.remove("Handebol");
        System.out.println(esportes);

        //Retorna o primeiro item do vetor
        System.out.println("----------\tRetorna o elemento:\t------------- ");
        System.out.println(esportes.get(0));

        //Navega nos esportes
        System.out.println("----------\tExibindo os elementos - usando o For:\t------------- ");
        for (String esporte : esportes){
            System.out.println(esporte);
        }


    }
}
