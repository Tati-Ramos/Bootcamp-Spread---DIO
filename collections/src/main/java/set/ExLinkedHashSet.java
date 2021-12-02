package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os números no set

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //remove o número do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);
        System.out.println("--------------");

        // retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());
        System.out.println("--------------");

        //navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------");
        for (Integer numero : sequenciaNumerica){
            System.out.println(numero);
        }

        //retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
