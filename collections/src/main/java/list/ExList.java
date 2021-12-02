package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        // Adiciona elementos na lista
        nomes.add("Tatiane");
        nomes.add("Pedro");
        nomes.add("Elaine");
        nomes.add("Mayara");
        nomes.add("Arthur");
        nomes.add("Antonio Carlos");
        nomes.add("Laura");
        nomes.add("Carlos");

        System.out.println("----------\tOrdem de inserção:\t------------- ");
        System.out.println(nomes);

        System.out.println("-----------\tAtualização da lista:\t------------ ");
        nomes.set(1,"Gilson");
        System.out.println(nomes);

        System.out.println("----------\tEm ordem alfabética:\t------------ ");
        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println("----------\tRemovendo um elemento:\t------------ ");
        nomes.remove(4);
        nomes.remove("Mayara");
        System.out.println(nomes);

        System.out.println("----------\tRetornando um elemento:\t------------ ");
        String nome = nomes.get(4);
        System.out.println(nome);

        System.out.println("----------\tQuantos elementos tem na lista:\t------------ ");
        int tamanho = nomes.size();
        System.out.println(tamanho);

        System.out.println("----------\tTem o nome Gilson na lista?\t------------ ");
        boolean temGilson = nomes.contains("Gilson");
        System.out.println(temGilson);

        System.out.println("----------\tA lista está vazia?\t------------ ");
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        System.out.println("----------\tQual é o índice do nome Tatiane da lista?\t------------ ");
        int posicao = nomes.indexOf("Tatiane");
        System.out.println(posicao);

        System.out.println("----------\tExibindo os nomes. Usando o For:\t------------ ");
        for (String nomeDoItem : nomes){
            System.out.println("---> " + nomeDoItem);
        }

        System.out.println("----------\tExibindo os nomes. Usando o Iterator:\t------------ ");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("---> " + iterator.next());
        }

        System.out.println("----------\tLimpe a lista e confirme se está vazia:\t------------ ");
        nomes.clear();
        System.out.println(nome);
        boolean listaVazia = nomes.isEmpty();
        System.out.println("Confirmando: "+listaVazia);



    }
}
