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
    }
}
