package list;

//Exemplo Queue

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExLinkedList {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        System.out.println("------------------------------");

        String clienteASerAtendido = filaBanco.poll();
        System.out.println("Cliente a ser atendido:\n " +clienteASerAtendido);
        System.out.println("------------------------------");

        System.out.println(filaBanco);
        System.out.println("-----------------------");

        //filaBanco.clear();
        String primeiroCliente = filaBanco.peek();// retorna o elemento, mas não remove da fila
        System.out.println("Peek --> "+primeiroCliente);
        System.out.println("-----------------------");

        System.out.println(filaBanco);
        System.out.println("-----------------------");

        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println("Element --> " +primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client : filaBanco){
            System.out.println("--->" +client);
        }
        System.out.println("------------------------------");

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("--->" +iteratorFilaBanco.next());
        }
        System.out.println("------------------------------");
        System.out.println(filaBanco.size());

        System.out.println("------------------------------");
        System.out.println(filaBanco.isEmpty());

    }
}
