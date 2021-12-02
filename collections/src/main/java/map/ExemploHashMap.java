package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String,Integer> campeoesMundialFifa = new HashMap<>();

        //adiciona os campeões mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanha",4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai",2);
        campeoesMundialFifa.put("Argentina",2);
        campeoesMundialFifa.put("França",2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha",1);

        System.out.println(campeoesMundialFifa);
        System.out.println("------------------------");

        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil",6);
        System.out.println(campeoesMundialFifa);

        //retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));
        System.out.println("-----------");

        //remove o campeão França
        campeoesMundialFifa.remove("França");
        System.out.println(campeoesMundialFifa);

        //retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        System.out.println("-----------");
        //retorna se existe ou não alguma seleção hexa campeã
        System.out.println(campeoesMundialFifa.containsKey(6));

        //retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());
        System.out.println("-----------");

        //navega nos registros do mapa
        for (Map.Entry<String,Integer> entry: campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("-----------");

        for (String key: campeoesMundialFifa.keySet()) {
            System.out.println(key + " --- " + campeoesMundialFifa.get(key));
        }

        System.out.println("------------------------");

        //verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        //verifica se o mapa contem o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        System.out.println("-----------");
        //verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();
        System.out.println(campeoesMundialFifa.size());



    }
}
