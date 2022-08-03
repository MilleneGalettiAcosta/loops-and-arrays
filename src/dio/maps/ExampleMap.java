package dio.maps;

/*
Dados os modelos dos carros e seus consumos na estrada faça:
modelo = gol - consumo = 14.4 km/l
modelo = uno - consumo = 15.6 km/l
modelo = mobi - consumo = 16.1 km/l
modelo = hb20 - consumo = 14.5 km/l
modelo = kwid - consumo = 15.6 km/l
 */

import java.util.*;

public class ExampleMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os modelos e seus consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15.2km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("Exibe consumo do uno: ");
        System.out.println(carrosPopulares.get("uno"));

        // Não possui méotodos de adicionar

        System.out.println("Exibe os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelos mais ecomico e seu consumo: ");
        Double max = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(max))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println(modeloMaisEficiente + " " + max);

        Double min = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();

        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(min))
                modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Menos eficiente: " + modeloMenosEficiente + " " + min);

        System.out.println("Exiba a soma dos consumos: ");
        int soma = 0;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("Média: " + soma / carrosPopulares.size());

        System.out.println("Remova os carros com consumos 15.6: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        if (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Crie um dicionário com ordem de inserção: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("Exiba o dicionário pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares3);

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println("Está vazio? " + carrosPopulares.isEmpty());

    }
}
